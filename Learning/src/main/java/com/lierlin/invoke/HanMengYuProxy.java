package com.lierlin.invoke;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HanMengYuProxy implements InvocationHandler {
    private Gril gril;

    public HanMengYuProxy(Gril gril) {
        this.gril = gril;
    }
//当我们通过动态代理对象调用一个方法时候，这个方法的调用就会被转发到实现InvocationHandler接口类的invoke方法来调用，看如下invoke方法：
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object o = method.invoke(gril,args);
        after();
        return o;
    }
    public void before(){
        System.out.println("这是约韩梦雨的前置条件");
    }
    public void after(){
        System.out.println("这是后置条件");
    }
    public Object getProxyInstance(){
        //Proxy类就是用来创建一个代理对象的类，它提供了很多方法，但是我们最常用的是newProxyInstance方法。
        return Proxy.newProxyInstance(gril.getClass().getClassLoader(),gril.getClass().getInterfaces(),this);
        //    loader：一个classloader对象，定义了由哪个classloader对象对生成的代理类进行加载
        //    interfaces：一个interface对象数组，表示我们将要给我们的代理对象提供一组什么样的接口，如果我们提供了这样一个接口对象数组，那么也就是声明了代理类实现了这些接口，代理类就可以调用接口中声明的所有方法。
        //    h：一个InvocationHandler对象，表示的是当动态代理对象调用方法的时候会关联到哪一个InvocationHandler对象上，并最终由其调用。
    }
}
