package com.lierlin;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {

    @Async
    public void executeAsyncTask(int i) {
        System.out.println("�첽����1��" + i+"��Thread.currentThread().getName():"+Thread.currentThread().getName());
    }

    @Async
    public void executeAsyncTask2(int i) {
        System.out.println("�첽����2��" + i+"��Thread.currentThread().getName():"+Thread.currentThread().getName());
    }

  /*  @Async
    public void executeAsyncTask3(int i) throws InterruptedException {

        System.out.println("�첽����2��" + i+"��Thread.currentThread().getName():"+Thread.currentThread().getName());
    }*/
}
