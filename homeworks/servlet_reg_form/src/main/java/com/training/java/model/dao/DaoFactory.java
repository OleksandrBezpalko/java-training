package com.training.java.model.dao;

import com.training.java.model.dao.impl.JDBCDaoFactory;

public abstract class DaoFactory  {
    private static DaoFactory daoFactory;
    public abstract UserDao createUserDao();

    public static DaoFactory getInstance(){
        if( daoFactory == null ){
            synchronized (DaoFactory.class){
                if(daoFactory==null){
                    DaoFactory temp = new JDBCDaoFactory();
                    daoFactory = temp;
                }
            }
        }
        return daoFactory;
    }
}
