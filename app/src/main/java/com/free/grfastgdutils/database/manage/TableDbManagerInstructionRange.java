package com.free.grfastgdutils.database.manage;

import com.free.grfastgdutils.database.tables.InstructionRange;

import org.greenrobot.greendao.AbstractDao;

/**
 * 指令保存
 * 类名称：UserDbManager(主要方法可以重新后直接使用数据库操作)
 * 创建者：Create by guorui
 * 创建时间：Create on 2018/8/03
 * 描述：继承AbstractDatabaseManager，可以直接实现数据库操作
 * 最近修改时间：2018/8/03
 */
public class TableDbManagerInstructionRange extends AbstractDatabaseManager<InstructionRange, Long> {
    private static TableDbManagerInstructionRange instance = null;

    @Override
    AbstractDao<InstructionRange, Long> getAbstractDao() {
        return daoSession.getInstructionRangeDao();
    }

    /**
     * 单例模式防同时操作数据库
     */
    public static TableDbManagerInstructionRange getInstance() {
        if (instance == null) {
            synchronized (TableDbManagerInstructionRange.class) {
                if (instance == null) {
                    instance = new TableDbManagerInstructionRange();
                }
            }
        }
        return instance;
    }
}
