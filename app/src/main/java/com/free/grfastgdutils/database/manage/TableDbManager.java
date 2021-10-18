package com.free.grfastgdutils.database.manage;

import com.free.grfastgdutils.database.tables.User;

import org.greenrobot.greendao.AbstractDao;

/**
 * 类名称：UserDbManager(主要方法可以重新后直接使用数据库操作)
 * 创建者：Create by guorui
 * 创建时间：Create on 2017/5/15
 * 描述：继承AbstractDatabaseManager，可以直接实现数据库操作
 * 最近修改时间：2017/5/15
 */
public class TableDbManager extends AbstractDatabaseManager<User, Long> {
    private static TableDbManager instance = null;

    @Override
    AbstractDao<User, Long> getAbstractDao() {
        return daoSession.getUserDao();
    }

    /**
     * 单例模式防同时操作数据库
     */
    public static TableDbManager getInstance() {
        if (instance == null) {
            synchronized (TableDbManager.class) {
                if (instance == null) {
                    instance = new TableDbManager();
                }
            }
        }
        return instance;
    }
}
