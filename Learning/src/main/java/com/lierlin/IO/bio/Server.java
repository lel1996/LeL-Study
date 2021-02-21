package com.lierlin.IO.bio;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8081);
        System.out.println("11111");
        Socket accept = serverSocket.accept();
        System.out.println("123");
        InputStream inputStream =accept.getInputStream();
    }
}
