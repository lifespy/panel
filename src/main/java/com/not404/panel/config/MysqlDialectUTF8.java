package com.not404.panel.config;


import org.hibernate.dialect.MySQL57Dialect;
import org.hibernate.dialect.MySQL5Dialect;

public class MysqlDialectUTF8 extends MySQL57Dialect {
    @Override
    public String getTableTypeString() {
        return  " ENGINE=InnoDB DEFAULT CHARSET=utf8";
    }
}
