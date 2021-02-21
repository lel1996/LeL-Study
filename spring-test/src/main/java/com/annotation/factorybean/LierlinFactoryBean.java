package com.annotation.factorybean;

import com.annotation.mapper.UserMapper;
import com.annotation.service.A;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LierlinFactoryBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
       /* return new A();*/

        Object o = Proxy.newProxyInstance(LierlinFactoryBean.class.getClassLoader(), new Class[]{UserMapper.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method.getName());
                System.out.println("1111111");
                return null;
            }
        });
        return o;
    }

    @Override
    public Class<?> getObjectType() {
        return UserMapper.class;
    }
}
