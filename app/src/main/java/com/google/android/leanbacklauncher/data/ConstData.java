package com.google.android.leanbacklauncher.data;

import android.content.Context;
import android.graphics.Color;
/**
 * Created by GaoFei on 2017/6/6.
 */

public class ConstData {
    public static Context appContext;
    public static final int[] APP_ITEM_BACK_COLORS = { Color.parseColor("#f4ea2a"),
            Color.parseColor("#1afa29"), Color.parseColor("#e26a00"), Color.parseColor("#0459d0"),
            Color.parseColor("#26eefd"), Color.parseColor("#f92812")};
    public static final String SETTINGS_PACKAGE = "com.android.tv.settings";
    public static final String SETTINGS_ACTIVITY = "com.android.tv.settings.MainSettings";
    /**
     * APP栏显示个数
     */
    public static final int APP_ROW_COUNT = 10;
    public static final int APP_COL_COUNT = 10;
    public interface NetWorkState{
        int NO = 0;
        int WIFI = 1;
        int ETHERNET = 2;
    }


    public interface  AppType{
        int MY_RECOMMAND = 0;
        int VIDEO = 1;
        int MUSIC = 2;
        int ALL = 3;
    }
}
