package com.lierlin.invoke.test;

public class LierlinTest {
    public static void main(String[] args) {
        IUser iUser = new Lierlin();
        LierlinProxy lierlinProxy =new LierlinProxy(iUser);
        IUser lierlin = (IUser) lierlinProxy.getProxyInstance();
        lierlin.eat();
    }
}
