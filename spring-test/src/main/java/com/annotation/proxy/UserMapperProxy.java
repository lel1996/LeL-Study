package com.annotation.proxy;

import com.annotation.mapper.UserMapper;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class UserMapperProxy implements InvocationHandler {
    private UserMapper userMapper;

    public UserMapperProxy(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object o = method.invoke(userMapper, args);
        return o;
    }

    public Object getInstance() {
       return Proxy.newProxyInstance(userMapper.getClass().getClassLoader(), userMapper.
                getClass().getInterfaces(), this);
    }
}
