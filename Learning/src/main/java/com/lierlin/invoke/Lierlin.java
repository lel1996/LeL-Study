package com.lierlin.invoke;

public class Lierlin {
    public static void main(String[] args) {
        Gril gril = new HanMengYu();
        HanMengYuProxy hanMengYuProxy = new HanMengYuProxy(gril);
        Gril hanMengYu = (Gril) hanMengYuProxy.getProxyInstance();
        hanMengYu.eat();

    }
}
