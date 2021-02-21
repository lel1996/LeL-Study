package com.lierlin.invoke.test1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class test1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class c1=Class.forName("com.lierlin.invoke.test1.Test");
        Method method=c1.getMethod("run",String.class);
        //method.setAccessible(true);
        method.invoke(c1.newInstance(),"lierlin");
    }
}
