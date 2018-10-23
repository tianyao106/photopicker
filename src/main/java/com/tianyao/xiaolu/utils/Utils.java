package com.tianyao.xiaolu.utils;

import android.content.Context;

/**
 * 修改人： 陆维淋
 * 时间： 2018/10/10
 * 名称：上下文工具类
 */
public class Utils {

    private static Context context;

    private Utils() {
        throw new UnsupportedOperationException("can't instantiate me");
    }

    public static void init(Context context) {
        Utils.context = context.getApplicationContext();
    }

    public static Context getContext() {
        if (context != null) {
            return context;
        }
        throw new NullPointerException("context is null");
    }
}
