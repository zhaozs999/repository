package com.zhaozs.utils;

import sun.net.util.IPAddressUtil;

import java.math.BigDecimal;
import java.util.Random;

/**
 * @ 创建人 zhaozs
 * @ 创建时间 2019/3/27
 * @ 描述
 */
public class Utils {
    // 根据时间戳获取Id
    public static BigDecimal getId() {
        long now = System.currentTimeMillis();
        BigDecimal timestamp = BigDecimal.valueOf(now);
        return timestamp;
    }

    // 随机获取id
    public static BigDecimal getRandomId() {
        String str = "123456789012345678901234567890";
        Random rd = new Random();
        char[] cha = new char[13];
        for (int i = 0; i < cha.length; i++) {
            int a = rd.nextInt(str.length());
            cha[i] = str.charAt(a);
        }
        String s = String.valueOf(cha);
        Long b = Long.valueOf(s);
        BigDecimal bigDecimal = BigDecimal.valueOf(b);
        return bigDecimal;
    }

}
