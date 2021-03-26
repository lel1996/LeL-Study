package com.lierlin.invoke.cglib;

public class Test {
    public static void main(String[] args) {
        //System.out.println(new MyCglibProxy(new DemoProxy().sayHello("lierlin")));
        //MyCglibProxy myCglibProxy = (MyCglibProxy) new MyCglibProxy("lierlin").getProxy(DemoProxy.class);
        DemoProxy demoProxy = (DemoProxy) new MyCglibProxy().getProxy(DemoProxy.class);
        demoProxy.sayHello("lidalin");
    }
}
