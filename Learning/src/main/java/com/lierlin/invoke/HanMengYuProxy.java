package com.lierlin.invoke;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HanMengYuProxy implements InvocationHandler {
    private Gril gril;

    public HanMengYuProxy(Gril gril) {
        this.gril = gril;
    }
//������ͨ����̬����������һ������ʱ����������ĵ��þͻᱻת����ʵ��InvocationHandler�ӿ����invoke���������ã�������invoke������
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object o = method.invoke(gril,args);
        after();
        return o;
    }
    public void before(){
        System.out.println("����Լ�������ǰ������");
    }
    public void after(){
        System.out.println("���Ǻ�������");
    }
    public Object getProxyInstance(){
        //Proxy�������������һ�����������࣬���ṩ�˺ܶ෽��������������õ���newProxyInstance������
        return Proxy.newProxyInstance(gril.getClass().getClassLoader(),gril.getClass().getInterfaces(),this);
        //    loader��һ��classloader���󣬶��������ĸ�classloader��������ɵĴ�������м���
        //    interfaces��һ��interface�������飬��ʾ���ǽ�Ҫ�����ǵĴ�������ṩһ��ʲô���Ľӿڣ���������ṩ������һ���ӿڶ������飬��ôҲ���������˴�����ʵ������Щ�ӿڣ�������Ϳ��Ե��ýӿ������������з�����
        //    h��һ��InvocationHandler���󣬱�ʾ���ǵ���̬���������÷�����ʱ����������һ��InvocationHandler�����ϣ�������������á�
    }
}
