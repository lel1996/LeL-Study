package com.lierlin.ThreadTest.callable.Zuofan;

import java.util.concurrent.Callable;

public class shicai implements Callable<Boolean> {
    @Override
    public Boolean call() throws Exception {
        try{
            System.out.println("ÂòÊ³²Ä");
            Thread.sleep(1000);
            System.out.println("ÂòºÃÊ³²Ä");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return true;
    }
}
