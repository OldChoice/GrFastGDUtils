package com.free.grfastgdutils.database.gen;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.free.grfastgdutils.database.tables.InstructionRange;
import com.free.grfastgdutils.database.tables.User;

import com.free.grfastgdutils.database.gen.InstructionRangeDao;
import com.free.grfastgdutils.database.gen.UserDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig instructionRangeDaoConfig;
    private final DaoConfig userDaoConfig;

    private final InstructionRangeDao instructionRangeDao;
    private final UserDao userDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        instructionRangeDaoConfig = daoConfigMap.get(InstructionRangeDao.class).clone();
        instructionRangeDaoConfig.initIdentityScope(type);

        userDaoConfig = daoConfigMap.get(UserDao.class).clone();
        userDaoConfig.initIdentityScope(type);

        instructionRangeDao = new InstructionRangeDao(instructionRangeDaoConfig, this);
        userDao = new UserDao(userDaoConfig, this);

        registerDao(InstructionRange.class, instructionRangeDao);
        registerDao(User.class, userDao);
    }
    
    public void clear() {
        instructionRangeDaoConfig.clearIdentityScope();
        userDaoConfig.clearIdentityScope();
    }

    public InstructionRangeDao getInstructionRangeDao() {
        return instructionRangeDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

}
