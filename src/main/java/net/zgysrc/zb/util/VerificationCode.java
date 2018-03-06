package net.zgysrc.zb.util;

import java.util.Random;

/**
 * 四位数验证码
 * 存文本输出
 * 前段渲染成图片
 */
public class VerificationCode {

    private static final int codeLength = 4;

    public static String getVerificationCode() {
        Random random = new Random();
        StringBuffer sbf = new StringBuffer();
        char[] codeAll = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < codeLength ; i++) {
            String code = String.valueOf(codeAll[random.nextInt(codeAll.length - 1)]);
            sbf.append(code);
        }
        return sbf.toString();
    }

}
