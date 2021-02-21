package com.lierlin.db.dbPool;
import java.sql.Connection;
import java.sql.SQLException;


 //���ӳ� ������

public class PoolUtil implements Pool{

    /**
     * �˴��������ó� ��ȡ �����ļ��ķ�ʽ
     */
    private static String jdbcDriver = "com.mysql.jdbc.Driver"; // ���ݿ�����
    private static String dbUrl = "jdbc:mysql://localhost:3306/tt?serverTimezone=UTC&characterEncoding=utf-8"; // ���� URL
    //jdbc.url=jdbc:mysql://localhost:3306/demo?serverTimezone=UTC&characterEncoding=utf-8
    private static String dbUsername = "root"; // ���ݿ��û���
    private static String dbPassword = "rootroot"; // ���ݿ��û�����

    private static ConnectionPool connPool = null;

    // ���óɵ���ģʽ ��ֹ ���ʵ�������ӳ�
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