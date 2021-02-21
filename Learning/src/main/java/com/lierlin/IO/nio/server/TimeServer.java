package com.lierlin.IO.nio.server;

public class TimeServer {
    public static void main(String[] args) {
        int port = 8086;
        if (args != null && args.length < 0) {
            port = Integer.valueOf(args[0]);
        }
        MultiplexerTimeServer timeServer = new MultiplexerTimeServer(port);
        new Thread(timeServer,"NIO-MultiplexerTimeServer-001").start();
    }
}