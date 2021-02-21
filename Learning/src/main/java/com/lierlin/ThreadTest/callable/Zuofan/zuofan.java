package com.lierlin.ThreadTest.callable.Zuofan;

import java.util.concurrent.Callable;

public class zuofan implements Callable<Boolean> {
    @Override
    public Boolean call() throws Exception {
        try{
            System.out.println("ื๖ทน");
            Thread.sleep(5000);
            System.out.println("ื๖บรทน");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return true;
    }
}