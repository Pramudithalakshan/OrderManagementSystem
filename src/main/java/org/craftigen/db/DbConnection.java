package org.craftigen.db;

public class DbConnection {
    private static DbConnection instance;
    private DbConnection(){}

    public static DbConnection getInstance(){
        return instance==null?instance=new DbConnection():instance;
    }
}
