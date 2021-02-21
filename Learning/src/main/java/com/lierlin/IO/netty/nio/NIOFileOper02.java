package com.lierlin.IO.netty.nio;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOFileOper02 {

	public static void main(String[] args) throws Exception {
		File file = new File("d:\\file01.txt");
		FileInputStream fis = new FileInputStream(file);
		//说明:
		/*
		 * 从输入流中获得一个通道，然后提供 ByteBuffer 缓冲区，该缓冲区的初始容量
		和文件的大小一样，最后通过通道的 read 方法把数据读取出来并存储到了 ByteBuffer 中
		 */
		FileChannel fc = fis.getChannel();
		ByteBuffer buffer = ByteBuffer.allocate((int) file.length());
		//该通道可以写操作，也可以读操作
		
		fc.read(buffer);
		System.out.print(new String(buffer.array()));
		fis.close();
	}

}
