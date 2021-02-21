package com.lierlin.IO.netty.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;

public class NIOFileOper03 {

    public static void main(String[] args) throws Exception {

        FileInputStream fileInputStream = new FileInputStream("1.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("2.txt");

        FileChannel in = fileInputStream.getChannel();
        FileChannel out = fileOutputStream.getChannel();

        ByteBuffer byteBuffer =ByteBuffer.allocate(512);

        while (true){
            byteBuffer.clear();//清空buffer
            int read = in.read(byteBuffer);
            if (read == -1){//代表读取数据完毕
                break;
            }
            byteBuffer.flip();//数据反转，把指针指向数据的开始而不是结尾
            //讲buffer中的数据写到buffer2中去
            out.write(byteBuffer);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

}
