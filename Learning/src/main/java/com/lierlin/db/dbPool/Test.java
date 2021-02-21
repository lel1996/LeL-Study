package com.lierlin.db.dbPool;
import java.sql.Connection;


public class Test {

    public static void main(String[] args) {
        PoolUtil pool = PoolUtil.getInstance();
        pool.initPool();
        Connection connection = pool.getConnection();

        Connection connection2 = pool.getConnection();

        Connection connection3= pool.getConnection();

        Connection connection4 = pool.getConnection();
        System.out.println("connection:"+connection);
        pool.returnConnection(connection);
        pool.returnConnection(connection2);
    }
}