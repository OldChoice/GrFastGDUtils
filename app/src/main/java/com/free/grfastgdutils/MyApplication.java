package com.free.grfastgdutils;

import android.app.Application;
import android.content.Context;

import com.free.grfastgdutils.database.manage.AbstractDatabaseManager;

/**
 * Create by guorui on 2020/11/24
 * Last update 2020/11/24
 * Description:
 **/
public class MyApplication extends Application {

    private static MyApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        AbstractDatabaseManager.initOpenHelper(getContext());//初始化数据库
    }


    public static MyApplication getInstance() {
        return instance;
    }

    /**
     * 获取上下文
     */
    public static Context getContext() {
        return getInstance().getApplicationContext();
    }

}

