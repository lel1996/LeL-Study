package com.lierlin.ThreadTest.CountDownLatch;

import java.util.concurrent.*;

/**
 * Created by zyl on 2016/12/4.
 */
public class CountDownLatchDemo {
//        CountDownLatch的实质本质与Thread的join方法一样。但join方法仅可以支持当
//        前线程等待一个线程的结束，若需要等待多个线程，则需要逐个线程的调用join方法，
//        非常麻烦。CountDwonLatch可以很方便的实现一个线程等待多个线程。
    public static void main(String[] arg) throws InterruptedException {

        System.out.println("current thread ..." + Thread.currentThread().getName());
        CountDownLatch count = new CountDownLatch(3);

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(new Worker(count, "悟空"));
        executorService.execute(new Worker(count, "八戒"));
        executorService.execute(new Worker(count, "沙僧"));

        new Boss(count, "唐僧").awaitForWorkerDone();
        System.out.println("所有事情都做完了,唐僧很满意！");
        executorService.shutdown();
    }

    static class Boss {
        private CountDownLatch count;

        private String bossName;

        public Boss(CountDownLatch count, String bossName) {
            this.bossName = bossName;
            this.count = count;
        }

        public void awaitForWorkerDone() throws InterruptedException {

            this.count.await();
            System.out.println("Boss monitor is done.");
        }

    }

    static class Worker implements Runnable {

        private CountDownLatch count;
        private String workerName;

        public Worker(CountDownLatch count, String workerName) {
            this.count = count;
            this.workerName = workerName;
        }

        @Override
        public void run() {
            System.out.println(workerName + " " + Thread.currentThread().getName() + " is running ..");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            /*
             * 完成任务，锁存计数减1*
             * */
            this.count.countDown();
        }
    }
}




