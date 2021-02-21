package com.lierlin.db.dbPool;

import java.sql.Connection;
 //定义 池pool具有的规则
public interface Pool {
    //获取 最初初始化的 连接数
    public int getInitialConnections();

    //设置 初始化连接数
    public void setInitialConnections(int initialConnections);

    //每次增长值
    public int getIncrementalConnections();

    //设置 每次增长值
    public void setIncrementalConnections(int incrementalConnections);

    //获取最大连接数
    public int getMaxConnections();

    //设置最大连接数
    public void setMaxConnections(int maxConnections);

    //初始化池
    public void initPool();

    // 获取连接
    public Connection getConnection();

    //释放(返还)连接到 池子
    public void returnConnection(Connection conn);

    //刷新 池子 相当于重启
    public void refreshConnections();

    //关闭连接池
    public void closeConnectionPool();
}