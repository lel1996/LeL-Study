package com.lierlin.db.dbPool;

import java.sql.Connection;
 //���� ��pool���еĹ���
public interface Pool {
    //��ȡ �����ʼ���� ������
    public int getInitialConnections();

    //���� ��ʼ��������
    public void setInitialConnections(int initialConnections);

    //ÿ������ֵ
    public int getIncrementalConnections();

    //���� ÿ������ֵ
    public void setIncrementalConnections(int incrementalConnections);

    //��ȡ���������
    public int getMaxConnections();

    //�������������
    public void setMaxConnections(int maxConnections);

    //��ʼ����
    public void initPool();

    // ��ȡ����
    public Connection getConnection();

    //�ͷ�(����)���ӵ� ����
    public void returnConnection(Connection conn);

    //ˢ�� ���� �൱������
    public void refreshConnections();

    //�ر����ӳ�
    public void closeConnectionPool();
}