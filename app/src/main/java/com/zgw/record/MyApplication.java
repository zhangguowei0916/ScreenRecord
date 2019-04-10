package com.zgw.record;

import android.app.Application;

import com.zgw.screenrecord.ScreenRecorderHelper;


/**
 * Created by zhangguowei on 2018/12/29.
 */

public class MyApplication extends Application {

    private ScreenRecorderHelper instance;
    public static MyApplication app;
    @Override
    public void onCreate() {
        super.onCreate();
        app=this;
        //init
        instance = ScreenRecorderHelper.getInstance(this);
    }

    public ScreenRecorderHelper getSRHelper(){
        return instance;
    }
    public static MyApplication getApp(){
        return app;
    }
}

