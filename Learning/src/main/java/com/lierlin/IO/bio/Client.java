package com.lierlin.IO.bio;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1", 8081);

        socket.getInputStream();
    }
}
