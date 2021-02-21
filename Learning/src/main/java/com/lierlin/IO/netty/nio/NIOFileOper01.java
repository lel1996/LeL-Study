package com.lierlin.IO.netty.nio;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOFileOper01 {

    public static void main(String[] args) throws Exception {

        String str = "hello,�й��~";
        FileOutputStream fos = new FileOutputStream("d:\\file01.txt");
        //ʹ��FileChannel ͨ��
        //fos.getChannle ���ص��� FileChanel ��ʵ������ FileChannelImpl
        //����׷��Դ����
        FileChannel fc = fos.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
		/*
		 *NIO �е�ͨ���Ǵ������������ͨ�� getChannel ������ȡ���ģ���ͨ����˫��ģ��ȿ�
            �Զ����ֿ���д������ͨ����д����֮ǰ������ͨ�� put ���������ݴ浽 ByteBuffer �У�Ȼ
            ��ͨ��ͨ���� write ����д���ݡ��� write ֮ǰ����Ҫ���� flip ������ת�����������ڲ�����
            ����ʼλ�ã������ڽ�����д����ʱ���ܰ���������д��ͨ����
		 */
        buffer.put(str.getBytes());
        buffer.flip();
        fc.write(buffer);
        fos.close();
    }


}
