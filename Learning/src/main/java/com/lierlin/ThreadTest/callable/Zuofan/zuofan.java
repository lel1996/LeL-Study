package com.lierlin.ThreadTest.callable.Zuofan;

import java.util.concurrent.Callable;

public class zuofan implements Callable<Boolean> {
    @Override
    public Boolean call() throws Exception {
        try{
            System.out.println("����");
            Thread.sleep(5000);
            System.out.println("���÷�");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return true;
    }
}