package net.zgysrc.zb.util;

public class JDBCLikeStringUtil {

    public static String JDBCLikeUtil(String string) {
        StringBuffer sb = new StringBuffer(string);
        StringBuffer sbc = new StringBuffer();
        for (int i = 0; i < sb.length(); i++) {
            char s = sb.charAt(i);
            sbc.append("%" + s);
        }
        sbc.append("%");
        return sbc.toString();
    }

}
