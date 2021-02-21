package com.lierlin.invoke.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LierlinProxy implements InvocationHandler {
    private IUser iUser;
    public LierlinProxy(IUser  iUser){
        this.iUser = iUser;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object o =method.invoke(iUser,args);
        return o;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(iUser.getClass().getClassLoader(),iUser.getClass().getInterfaces(),this);
    }
}
