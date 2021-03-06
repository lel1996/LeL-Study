package com.lierlin;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by sang on 16-12-14.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService bean = context.getBean(AsyncTaskService.class);
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            bean.executeAsyncTask(i);
            bean.executeAsyncTask2(i);
           // bean.executeAsyncTask3(i);
        }
        context.close();
    }
}
