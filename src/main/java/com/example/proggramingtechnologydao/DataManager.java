package com.example.proggramingtechnologydao;

import org.postgresql.ds.PGSimpleDataSource;

import javax.sql.DataSource;

public class DataManager {
    public static DataSource createDataSource(){
        final String url =
                "jdbc:postgresql://localhost:5432/accounting_db?user=postgres&password=123";
        final PGSimpleDataSource dataSource = new PGSimpleDataSource();
        dataSource.setUrl(url);
        return dataSource;
    }
}
