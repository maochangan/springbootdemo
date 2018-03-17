package net.zgysrc.zb.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.zgysrc.zb.bean.GoodsInfo;
import net.zgysrc.zb.bean.User;
import net.zgysrc.zb.service.GoodsService;
import net.zgysrc.zb.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@CrossOrigin(origins = "*" , maxAge = 3600)
@RestController
@RequestMapping(value = "goodsController")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value = "getIndexGoods" , method = RequestMethod.GET)
    public JsonResult getIndexGoods(Integer pn , HttpSession session){
        User user = (User) session.getAttribute("user");
        PageHelper.startPage(pn , 16);
        if(null == user){
            List<GoodsInfo> list = goodsService.getIndexGoods("");
            if(null == list){
                return JsonResult.fail().add("msg" , "无信息！");
            }else{
                PageInfo<GoodsInfo> pageInfo = new PageInfo<GoodsInfo>(list);
                return JsonResult.success().add("pageInfo" , pageInfo);
            }
        }else {
            String keyWord = "hello";
            List<GoodsInfo> list = goodsService.getIndexGoods(keyWord);
            if(null == list){
                return JsonResult.fail().add("msg" , "无信息！");
            }else{
                PageInfo<GoodsInfo> pageInfo = new PageInfo<GoodsInfo>(list);
                return JsonResult.success().add("pageInfo" , pageInfo);
            }
        }
    }

    @RequestMapping(value = "getAllGoodsByCondition" , method = RequestMethod.GET)
    public JsonResult getAllGoodsByCondition(String keyWord ,Integer pSize){
        PageHelper.startPage(1 , pSize);
        List<GoodsInfo> list = goodsService.getAllGoodsByCondition(keyWord);
        if(null == list){
            return JsonResult.fail().add("msg", "无信息！");
        }else{
            PageInfo<GoodsInfo> pageInfo = new PageInfo<GoodsInfo>(list);
            return JsonResult.success().add("pageInfo" , pageInfo);
        }
    }

    @RequestMapping(value = "getGoodsInfoById" , method = RequestMethod.GET)
    public JsonResult getGoodsInfoById(Integer id){
        GoodsInfo goodsInfo = goodsService.getGoodsInfoById(id);
        if(null == goodsInfo){
            return JsonResult.fail().add("msg" , "无信息！");
        }else{
            return JsonResult.success().add("goodsInfo", goodsInfo);
        }
    }


}
