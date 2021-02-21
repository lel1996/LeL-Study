package com.lierlin.IO.netty.nio;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOFileOper02 {

	public static void main(String[] args) throws Exception {
		File file = new File("d:\\file01.txt");
		FileInputStream fis = new FileInputStream(file);
		//˵��:
		/*
		 * ���������л��һ��ͨ����Ȼ���ṩ ByteBuffer ���������û������ĳ�ʼ����
		���ļ��Ĵ�Сһ�������ͨ��ͨ���� read ���������ݶ�ȡ�������洢���� ByteBuffer ��
		 */
		FileChannel fc = fis.getChannel();
		ByteBuffer buffer = ByteBuffer.allocate((int) file.length());
		//��ͨ������д������Ҳ���Զ�����
		
		fc.read(buffer);
		System.out.print(new String(buffer.array()));
		fis.close();
	}

}
