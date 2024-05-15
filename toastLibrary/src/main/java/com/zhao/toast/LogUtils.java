package com.zhao.toast;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class LogUtils {

    public static void info(String message) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        final String date = sdf.format(new Date());
        System.out.println(date + " ---- " + message);
    }


    public static void error(String tag, String message, Throwable throwable) {
        com.blankj.utilcode.util.LogUtils.e(tag, message, throwable);
    }
}
