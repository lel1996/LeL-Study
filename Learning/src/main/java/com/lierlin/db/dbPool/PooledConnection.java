package com.lierlin.db.dbPool;
import java.sql.Connection;

/**
 * ��¼ÿ���Ѿ��������ӵ�״̬  �Ƿ�æµ
 * ���� ��ȡ��æµ�� connect
 */
public class PooledConnection {
    Connection connection = null; // ���ݿ�����
    // �������Ƿ�����ʹ�õı�־��Ĭ��û������ʹ��
    boolean busy = false;
    // ���캯��������һ�� Connection ����һ�� PooledConnection ����
    public PooledConnection(Connection connection) {
        this.connection = connection;
    }

    // ���ش˶����е�����
    public Connection getConnection() {
        return connection;
    }

    // ���ô˶���ģ�����
    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    // ��ö��������Ƿ�æ
    public boolean isBusy() {
        return busy;
    }

    // ���ö������������æ
    public void setBusy(boolean busy) {
        this.busy = busy;
    }


}

