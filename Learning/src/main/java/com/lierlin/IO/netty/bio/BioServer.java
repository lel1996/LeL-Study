package com.lierlin.IO.netty.bio;
//����һ���̳߳�
//2.����пͻ��˽������Ӿʹ���һ���߳���֮ͨ��

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BioServer {
    public static void main(String[] args) throws IOException {
        ExecutorService executorService = Executors.newCachedThreadPool();

        ServerSocket serverSocket =new ServerSocket(6666);
        System.out.println("������������");
        while (true){
            //�����ȴ��ͻ�������
            final Socket socket = serverSocket.accept();
            System.out.println("���ӵ�һ���ͻ���");
            //ͨ���̳߳ؿ���һ���߳�
            executorService.execute(()->{

                    handler(socket);

            });
        }

    }
    static void handler(Socket socket)  {
        try {
            byte[] bytes = new byte[1024];
            InputStream inputStream = null;
            try {
                inputStream = socket.getInputStream();
            } catch (IOException e) {
                System.out.println("1");
                e.printStackTrace();
            }
            while (true){
                int read = 0;
                try {
                    read = inputStream.read(bytes);
                } catch (IOException e) {
                    System.out.println("2");
                    e.printStackTrace();
                }
                if (read>0) {
                    System.out.println(new String(bytes, 0, read));
                }else{
                    break;
                }
            }
        }catch (Exception e){
            System.out.println("3");
            e.printStackTrace();
        }finally {
            System.out.println("�رտͻ�������");
            try{
                socket.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }



    }
}
