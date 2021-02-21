package com.lierlin.ThreadTest.callable.Zuofan;

import java.util.concurrent.Callable;

public class chuju implements Callable<Boolean> {
    @Override
    public Boolean call() throws Exception {
        try{
            System.out.println("Âò³ø¾ß");
            Thread.sleep(3000);
            System.out.println("ÂòºÃ³ø¾ß");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return true;
    }
}