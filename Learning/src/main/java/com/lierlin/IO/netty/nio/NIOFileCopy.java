package com.lierlin.IO.netty.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

public class NIOFileCopy {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis=new FileInputStream("d:\\Koala.jpg");
		FileOutputStream fos=new FileOutputStream("d:\\Koala2.jpg");
		/*
		 * 说明
		 * 从两个流中得到两个通道，sourCh ,destCh ，
		 * 然后直接调用 transferFrom 完成文件复制
		 */
		FileChannel sourCh = fis.getChannel();
		FileChannel destCh = fos.getChannel();
		
		/*
		 * transferFrom 方法可以将两个通道连接起来，进行数据传输
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
		System.out.println("图片拷贝完毕~~");
	}

}
