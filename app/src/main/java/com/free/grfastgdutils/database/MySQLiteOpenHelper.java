package com.free.grfastgdutils.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.free.grfastgdutils.database.DataMigrate.MigrationHelper;
import com.free.grfastgdutils.database.gen.DaoMaster;
import com.free.grfastgdutils.database.gen.InstructionRangeDao;
import com.free.grfastgdutils.database.gen.UserDao;

/**
 * 类名称：MySQLiteOpenHelper
 * 创建者：Create by guorui
 * 创建时间：Create on 2018/8/17
 * 描述：用于升级数据库，在onUpgrade中有几个升级的表就写几个
 * 最近修改时间：2018/10/31
 */
public class MySQLiteOpenHelper extends DaoMaster.OpenHelper {

    public MySQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, name, factory);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.i("greenDAO", "Upgrading schema from version " + oldVersion + " to " + newVersion + " by dropping all tables");
//        数据库升级时候要填入所有表单
        MigrationHelper.migrate(db,
                UserDao.class,
                InstructionRangeDao.class);

    }
}
