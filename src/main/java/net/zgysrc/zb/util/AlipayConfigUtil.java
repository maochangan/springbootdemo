package net.zgysrc.zb.util;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfigUtil {

    /* *
     *类名：AlipayConfig
     *功能：基础配置类
     *详细：设置帐户有关信息及返回路径
     *修改日期：2017-04-05
     *说明：
     *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
     *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
     */
    // ↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    public static String app_id = "2016091000480934";
    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCc9Ksd14QuPzbbVIUkHM+fJ23owdZhz9v3zRh2ErvGi/6jJM8KHsE4bLF+LJAC+Q1ROVjcL43hSv2CDfQ/3OXcdAaYWBI5WM9dtRNDPunI7gdhHNS1V4H40LqsHy6AcRpDij00iaZKBpqNzBOfnGTPAF4wMKl0M/DSrdNmD7q57Jvk73iANjuboTP2zoXIQiB7x2nLLJanNVgnQebHuXajkxZikPZ2HB/ZTfvz8sDyZCioJFpB+jkA5QS23hqZXJgMbO5sTg9IrXMMEE6enUYoH5KWeOpkRrWe3kaNQh5sBC+PDr32CNw+oRB2Powk/o6RVlUm7qUHnQUFEZxdmbCHAgMBAAECggEAFS7cTVnB6C/16mIc2gPdbaB3r/tBQNA54tbWX1El8KUCR+h23OnLsB7TUbEX+p68UmMIACeW4Xoqfrv9ZAUfLMKoBTWVuBGpYv9GS0QZb1nYux2WA6d8ziT1nLdUolchcU4d9pJBVCpR/6M0Xs1PubRWAfD/XcSI0xZMurCSxfbXzOVqVlX6QRyIx35iBlvLfbKZhyviztvV34SPx2Lu8H/Eeo1rpkrIcK4RHvP3HAVdid7eVPzSdxH25rw3Qgsa0upSnRBcifSPnvOHDaBAm4qT0WelXFGWIyWpdFCUyp4BIX5XmTzIkwk+4pUpUrCcAh+hIUQKEwTFt17D+dNLGQKBgQDYE6qnb63+Q6s6elkIq581xYO5vRLLAW/6NfyiPT2+TZYIE8Iy93miPadyBnTNBkEhHrobEyLelcMIbxw22G3/Rl85ixLs70WdUJgBnsyTPN5LdPT7COvOpsiwL9o2xtUhr07j69RBXzQWAGbMOe81Qp3NdtoSefvxhpaLmoqAnQKBgQC59JoTYUYWh1FK5tkumOS8w+w+omvR/lFQTNVWQWkogY5ZlD6fRDcmL+GlXXDPmXZPmQhMU8SVyJOz9e6xh7r3apb3qzlouq4IoMe/uXmhwwTdFaoPQMISCzitfa0asd3ga1POIKd0s8j2EON5aucZF0bVv/cR3xQ3/Khos8xycwKBgQCKkFoQk5qlgmmMz6bG25/2kJn/g1NI4bwYXYSL2e/9WK3MsjcIDhFvTFBT2/YNAGTFw3mfIS9sQ+fVQcN7HGG1oUAxm5DgZjRjRKql51rTVOZMx0zOqxLk66mo6pbqJ6nHty9FFBeCcHXrYgiKEODoa7bcaso/rQA3C5MBJXKKNQKBgFzmU1cdQKuenMFDxPqfjZ60bsD32c/GMw9f4zC9avC+kMQ16Hce2EJup1c68FH2hAHOHTQsoUiHNSsx0TbF7WUPzi4bT4n/wVQ0JrakzZw/1p0w5o3KN2pWStF5uNJeS8+DLxIKhD4sV1h/JXWSL7P8SfoddixqeyphQi1Ure37AoGASmq8opvo9zecK8YeFUbh9J8dMjRmro+JN8Pm7i19mjWep6lN1l9Y4IID+IVjz9x3Icwuu9gRnZgmsKWWbgbQPDjcPTMuX5B3YASvnQ1gznyskO31rOw0BH6M0HRWFJYAbINTmxNXldMZaebg8osijrupynHgmiIK3vuZAFJrNtA=";
    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm
    // 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsXwXWPeyA38RlRHc4XscRVtTWryYV+PbKSMDF8zNw7hw2083aKIpFaqjDLj9Zbi3BfR8ufoNKoMWts1nzsdjZ5oPUUPkUpx3vz4axQf6kFOTyEE++yKSQo0fTolPVczfEdtHUMr5pC7quuUGpdxH7IoFWracb7F93JpVnEdpA92FC96C1uCEn5QekpkrGAwF3yViXP9+3/wnfrOG4d46GZAvLz1jET+p+3GkGaGqw2Ls6+h2Www0E87vo7rYRtHAhiQweOXTJqQPZZtVnNMfl5Mk9p92gok0ZL+OGkJaXNSDnbNpavHws4fujFFYkyR+d5t7zOjIZu4CLNkB5ob1pQIDAQAB";

    // 服务器异步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String vip_notify_url = "http://" + Configuration.IP + ":" + Configuration.PORT + "/zb/userController/notify_url";
    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String vip_return_url = "http://" + Configuration.IP + ":" + Configuration.PORT + "/zb/userController/vip_return_url";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关

    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    public static String log_path = "C:/";

    // ↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     *
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis() + ".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
