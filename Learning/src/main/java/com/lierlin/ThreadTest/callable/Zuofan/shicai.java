package com.lierlin.ThreadTest.callable.Zuofan;

import java.util.concurrent.Callable;

public class shicai implements Callable<Boolean> {
    @Override
    public Boolean call() throws Exception {
        try{
            System.out.println("��ʳ��");
            Thread.sleep(1000);
            System.out.println("���ʳ��");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return true;
    }
}
