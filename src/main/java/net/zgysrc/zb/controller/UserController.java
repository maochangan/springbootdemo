package net.zgysrc.zb.controller;


import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.github.pagehelper.PageHelper;
import net.zgysrc.zb.bean.User;
import net.zgysrc.zb.service.UserService;
import net.zgysrc.zb.util.AlipayConfigUtil;
import net.zgysrc.zb.util.JsonResult;
import net.zgysrc.zb.util.VerificationCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(value = "userController")
public class UserController {

    Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    /**
     * 获取信息   测试用 上线删除
     *
     * @return
     */
    @RequestMapping(value = "getAllUser", method = RequestMethod.GET)
    public JsonResult getAllUser() {
        List<User> list = userService.getAllUser();
        if (list == null) {
            return JsonResult.fail().add("msg", "无信息！");
        } else {
            return JsonResult.success().add("list", list);
        }
    }

    /**
     * 获取信息   测试用 上线删除
     *
     * @return
     */
    @RequestMapping(value = "getAllUserPage", method = RequestMethod.GET)
    public JsonResult getAllUserPage(Integer pn, Integer pSize, String userName) {
        PageHelper.startPage(pn, pSize);
        List<User> list = userService.getAllUserPage(userName);
        if (list == null) {
            return JsonResult.fail().add("msg", "无信息！");
        } else {
            return JsonResult.success().add("list", list);
        }
    }

    /**
     * 检查用户名是否存在
     *
     * @param userName
     * @return
     */
    @RequestMapping(value = "checkUserName", method = RequestMethod.GET)
    public JsonResult checkUserName(String userName) {
        boolean state = userService.checkUserName(userName);
        if (state) {
            return JsonResult.success().add("msg", "用户名可用！");
        } else {
            return JsonResult.fail().add("msg", "用户名已存在！");
        }
    }

    /**
     * 检查手机号是否存在
     *
     * @param mobileNum
     * @return
     */
    @RequestMapping(value = "checkMobileNum", method = RequestMethod.GET)
    public JsonResult checkMobileNum(String mobileNum) {
        boolean state = userService.checkMobileNum(mobileNum);
        if (state) {
            return JsonResult.success().add("msg", "手机号可用！");
        } else {
            return JsonResult.fail().add("msg", "手机号已存在！");
        }
    }

    /**
     * 用户注册以及登录
     *
     * @param user
     * @param session
     * @return
     */
    @RequestMapping(value = "userRegister", method = RequestMethod.POST)
    public JsonResult userRegister(User user, HttpSession session) {
        boolean state = userService.userRegister(user);
        if (state) {
            User userLogin = userService.getOwnerUser(user);
            if (userLogin == null) {
                return JsonResult.fail().add("msg", "用户名密码不正确！请检查后再试！");
            }
            session.setAttribute("user", userLogin);
            return JsonResult.success().add("msg", "注册成功！");
        } else {
            return JsonResult.fail().add("msg", "注册失败！用户名不正确！请重新输入！");
        }
    }

    /**
     * 用户登录
     *
     * @param user
     * @param session
     * @return
     */
    @RequestMapping(value = "userLogin", method = RequestMethod.POST)
    public JsonResult userLogin(User user, String code, HttpSession session) {
        User userLogin = userService.getOwnerUser(user);
        String sessionCode = (String) session.getAttribute("verificationCode");
        if (!sessionCode.equalsIgnoreCase(code)) {
            return JsonResult.fail().add("msg", "验证码错误！");
        } else {
            if (userLogin == null) {
                return JsonResult.fail().add("msg", "用户名密码不正确！请检查后再试！");
            } else {
                session.setAttribute("user", userLogin);
                userLogin.setPassword(null);
                return JsonResult.success().add("msg", "登录成功！").add("userInfo", userLogin);
            }
        }
    }

    /**
     * 获取登录验4位证码，非手机验证码
     *
     * @param session
     * @return
     */
    @RequestMapping(value = "getVerificationCode", method = RequestMethod.GET)
    public JsonResult getVerificationCode(HttpSession session) {
        log.info("获取验证码开始");
        String verificationCode = VerificationCode.getVerificationCode();
        if (verificationCode.length() != 4 && verificationCode == null && verificationCode == "") {
            return JsonResult.fail().add("msg", "获取验证码失败！请重试！");
        }
        session.setAttribute("verificationCode", verificationCode);
        log.info(verificationCode);
        return JsonResult.success().add("code", verificationCode);
    }

    /**
     * 用户信息详情
     *
     * @param session
     * @return
     */
    @RequestMapping(value = "getUserInfo", method = RequestMethod.GET)
    public JsonResult getUserInfo(HttpSession session) {
        User user = (User) session.getAttribute("userLogin");
        if (user == null) {
            return JsonResult.fail().add("msg", "请登入！");
        }
        return JsonResult.fail().add("msg", "msg");
    }

    /**
     * 文件上传测试
     *
     * @param file
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "uploadFileTest", method = RequestMethod.POST)
    public JsonResult uploadFileTest(MultipartFile file, HttpServletRequest request) throws Exception {
        System.out.println(file.getOriginalFilename() + "this!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        String pathL = "D://file/pic/pic/";
        File dirL = new File(pathL);
        if (!dirL.exists()) {
            dirL.mkdirs();
        }
        String path = pathL + file.getOriginalFilename();
        System.out.println(path);
        File dir = new File(path);
        file.transferTo(dir);
        String dataPath = "http://" + "localhost" + ":" + request.getLocalPort()
                + request.getServletContext().getContextPath() + "/pic/pic/"
                + file.getOriginalFilename();
        System.out.println(dataPath);
        return JsonResult.success().add("path", dataPath);
    }

    /**
     * 支付测试
     *
     * @param response
     * @param session
     * @return
     * @throws AlipayApiException
     * @throws IOException
     */
    @RequestMapping(value = "toPayTest", method = RequestMethod.POST)
    public JsonResult toPayTest(HttpServletResponse response, HttpSession session) throws AlipayApiException, IOException {
        /*价格*/
        String price = "0.1";
        /*标题*/
        String title = "测试111";
        /*信息*/
        String goodInfo = "测试信息";

        Integer id = 1;
        Integer userId = 2;
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfigUtil.gatewayUrl, AlipayConfigUtil.app_id,
                AlipayConfigUtil.merchant_private_key, "json", AlipayConfigUtil.charset, AlipayConfigUtil.alipay_public_key,
                AlipayConfigUtil.sign_type);
        // 设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setNotifyUrl(AlipayConfigUtil.vip_notify_url);
        alipayRequest.setReturnUrl(AlipayConfigUtil.vip_return_url);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        // 商户订单号，商户网站订单系统中唯一订单号，必填
        String out_trade_no = sdf.format(new Date()) + "?" + id + "!" + userId;
        // 付款金额，必填
        String total_amount = price.replace(",", "");
        alipayRequest.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\"," + "\"total_amount\":\""
                + total_amount + "\"," + "\"subject\":\"" + title + "\"," + "\"body\":\"" + goodInfo + "\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        // 请求
        String result = alipayClient.pageExecute(alipayRequest).getBody();
        AlipayConfigUtil.logResult(result);// 记录支付日志
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print(result);
        return null;
    }

    /**
     * p2p信息返回
     *
     * @param response
     * @param request
     * @param e
     * @return
     * @throws UnsupportedEncodingException
     */
    @RequestMapping(value = "vip_notify_url", method = RequestMethod.POST)
    public JsonResult vipNotifyUrl(HttpServletResponse response, HttpServletRequest request, Exception e) throws UnsupportedEncodingException {
        // 商户订单号
        String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "utf-8");
        StringBuffer sb = new StringBuffer(out_trade_no);
        String ids = sb.substring(sb.indexOf("?") + 1, sb.indexOf("!"));
        Integer id = Integer.valueOf(ids);
        String uid = sb.substring(sb.indexOf("!") + 1, sb.length());
        Integer userId = Integer.valueOf(uid);
        /*商品信息  数据库获取*/
//        ArtPicInfo artPicInfo = artGalleryService.getArtImgInfoById(id);
        // 付款金额
        String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"), "utf-8");
        // 支付宝交易号
        String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"), "utf-8");
        // 交易说明
        String cus = new String(request.getParameter("body").getBytes("ISO-8859-1"), "utf-8");
        // 交易状态
        String trade_status = new String(request.getParameter("trade_status").getBytes("ISO-8859-1"), "utf-8");
        if (trade_status.equals("TRADE_SUCCESS")) {// 支付成功商家操作
            /*成功后数据入库操作*/
            return JsonResult.success().add("msg", cus);
        } else {
            String msg = "失败！";
            return JsonResult.fail().add("e", e.toString()).add("msg", msg);
        }
    }

    /**
     * 信息返回  本地
     *
     * @param response
     * @param request
     * @return
     */
    @RequestMapping(value = "vip_return_url", method = RequestMethod.GET)
    public JsonResult vipReturnUrl(HttpServletResponse response, HttpServletRequest request) throws Exception {
        // 商户订单号
        String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "utf-8");
        Map<String, String> map = new HashMap<String, String>();
        map.put("单号", out_trade_no);
        map.put("out_trade_no", out_trade_no);
        String msg = "付款成功！请联系商家确定个人信息！";
        return JsonResult.success().add("msg", msg).add("map", map);
    }

    /**
     * 测试 放回html
     */
    @RequestMapping(value = "testHtml", method = RequestMethod.GET)
    public JsonResult tetsHtml(HttpServletResponse response) throws IOException {
        String result = "<div style=\"margin: 0 auto; background-color: aquamarine; width: 100%; height: 500px;\">\n" +
                "\t\t\t<div align=\"center\">\n" +
                "\t\t\t\t<p>支付成功！3秒后回到主页<a href=\"http://www.zgysrc.net\">www.zgysrc.net</a></p>\n" +
                "\t\t\t</div>\t\t\t\n" +
                "\t\t</div>" +
                "<div id=\"timer\"></div>\n" +
                "<script type=\"text/javascript\" language=\"javascript\">\n" +
                "var endDate=new Date(2018,02,06,16,17,40);//年月日时分秒，月要减去1\n" +
                "(function daoJiShi()\n" +
                "{\n" +
                " var now=new Date();\n" +
                " var oft=Math.round((endDate-now)/1000);\n" +
                " var ofd=parseInt(oft/3600/24);\n" +
                " var ofh=parseInt((oft%(3600*24))/3600);\n" +
                " var ofm=parseInt((oft%3600)/60);\n" +
                " var ofs=oft%60;\n" +
                " document.getElementById('timer').innerHTML='还有 '+ofd+' 天 ' +ofh+ ' 小时 ' +ofm+ ' 分钟 ' +ofs+ ' 秒';\n" +
                " if(ofs<0){document.getElementById('timer').innerHTML='倒计时结束！';window.location.href='http://www.zgysrc.net';return;};\n" +
                " setTimeout('daoJiShi()',1000);\n" +
                "}());\n" +
                "</script>";
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print(result);
        return null;
    }
}
