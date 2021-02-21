package com.lierlin.db.dbPool;
import java.sql.Connection;
import java.sql.SQLException;


 //连接池 工具类

public class PoolUtil implements Pool{

    /**
     * 此处可以设置成 读取 配置文件的方式
     */
    private static String jdbcDriver = "com.mysql.jdbc.Driver"; // 数据库驱动
    private static String dbUrl = "jdbc:mysql://localhost:3306/tt?serverTimezone=UTC&characterEncoding=utf-8"; // 数据 URL
    //jdbc.url=jdbc:mysql://localhost:3306/demo?serverTimezone=UTC&characterEncoding=utf-8
    private static String dbUsername = "root"; // 数据库用户名
    private static String dbPassword = "rootroot"; // 数据库用户密码

    private static ConnectionPool connPool = null;

    // 设置成单例模式 防止 多次实例化连接池
    private static PoolUtil instance = new PoolUtil();
    private PoolUtil(){};
    public static PoolUtil getInstance(){

        return instance;
    }

    static{

        connPool = new ConnectionPool(jdbcDriver, dbUrl , dbUsername, dbPassword);

    }

    @Override
    public int getInitialConnections() {

        return connPool.getInitialConnections();
    }

    @Override
    public void setInitialConnections(int initialConnections) {

        connPool.setInitialConnections(initialConnections);
    }

    @Override
    public int getIncrementalConnections() {

        return connPool.getIncrementalConnections();
    }

    @Override
    public void setIncrementalConnections(int incrementalConnections) {

        connPool.setIncrementalConnections(incrementalConnections);
    }

    @Override
    public int getMaxConnections() {

        return connPool.getMaxConnections();
    }

    @Override
    public void setMaxConnections(int maxConnections) {

        connPool.setMaxConnections(maxConnections);
    }

    @Override
    public void initPool() {
        try {
            connPool.createPool();
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    @Override
    public Connection getConnection() {

        Connection conn = null;
        try {
            conn = connPool.getConnection();
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return conn;
    }

    @Override
    public void returnConnection(Connection conn) {

        connPool.returnConnection(conn);
    }

    @Override
    public void refreshConnections() {

        try {
            connPool.refreshConnections();
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    @Override
    public void closeConnectionPool() {

        try {
            connPool.closeConnectionPool();
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

}