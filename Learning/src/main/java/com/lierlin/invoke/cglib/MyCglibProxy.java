package com.lierlin.invoke.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;


import java.lang.reflect.Method;

public class MyCglibProxy implements MethodInterceptor {

    Enhancer enhancer = new Enhancer();

    public Object getProxy(Class cls){
        enhancer.setSuperclass(cls);
        enhancer.setCallback(this);
        return enhancer.create();
}
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib??????????????");
        Object result = methodProxy.invokeSuper(o,objects);
        return result;
    }
}
