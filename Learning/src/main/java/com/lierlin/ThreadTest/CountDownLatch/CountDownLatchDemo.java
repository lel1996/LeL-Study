package com.lierlin.ThreadTest.CountDownLatch;

import java.util.concurrent.*;

/**
 * Created by zyl on 2016/12/4.
 */
public class CountDownLatchDemo {
//        CountDownLatch��ʵ�ʱ�����Thread��join����һ������join����������֧�ֵ�
//        ǰ�̵߳ȴ�һ���̵߳Ľ���������Ҫ�ȴ�����̣߳�����Ҫ����̵߳ĵ���join������
//        �ǳ��鷳��CountDwonLatch���Ժܷ����ʵ��һ���̵߳ȴ�����̡߳�
    public static void main(String[] arg) throws InterruptedException {

        System.out.println("current thread ..." + Thread.currentThread().getName());
        CountDownLatch count = new CountDownLatch(3);

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(new Worker(count, "���"));
        executorService.execute(new Worker(count, "�˽�"));
        executorService.execute(new Worker(count, "ɳɮ"));

        new Boss(count, "��ɮ").awaitForWorkerDone();
        System.out.println("�������鶼������,��ɮ�����⣡");
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
             * ����������������1*
             * */
            this.count.countDown();
        }
    }
}




