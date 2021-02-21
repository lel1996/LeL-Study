package com.lierlin.IO.netty.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

public class NIOFileCopy {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis=new FileInputStream("d:\\Koala.jpg");
		FileOutputStream fos=new FileOutputStream("d:\\Koala2.jpg");
		/*
		 * ˵��
		 * ���������еõ�����ͨ����sourCh ,destCh ��
		 * Ȼ��ֱ�ӵ��� transferFrom ����ļ�����
		 */
		FileChannel sourCh = fis.getChannel();
		FileChannel destCh = fos.getChannel();
		
		/*
		 * transferFrom �������Խ�����ͨ�������������������ݴ���
	 * @param  src
     *         The source channel
     *
     * @param  position
     *         The position within the file at which the transfer is to begin;
     *         must be non-negative
     *
     * @param  count
     *         The maximum number of bytes to be transferred; must be
     *         non-negative
     *
     * @return  The number of bytes, possibly zero,
     *          that were actually transferred
		 */
		
		destCh.transferFrom(sourCh, 0, sourCh.size()); 
		sourCh.close();
		destCh.close();
		fis.close();
		fos.close();
		System.out.println("ͼƬ�������~~");
	}

}
