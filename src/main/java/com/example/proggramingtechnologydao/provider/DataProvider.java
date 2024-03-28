package com.example.proggramingtechnologydao.provider;

import com.example.proggramingtechnologydao.dao.AccountDbDao;
import com.example.proggramingtechnologydao.dao.AccountFileDao;
import com.example.proggramingtechnologydao.infrastructure.IAccountDao;

public class DataProvider {
    private static final String DataBase = "db";
    public static final String File = "file";
    public static final String RAM = "ram";

    public static IAccountDao createTaskDao(String type){
        if (type.equalsIgnoreCase(DataBase)){
            return new AccountDbDao();
        }
        else if (type.equalsIgnoreCase(File)){
            return new AccountFileDao();
        }
        return null;
    }
}
