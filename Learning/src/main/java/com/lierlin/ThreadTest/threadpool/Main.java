package com.lierlin.ThreadTest.threadpool;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //corePoolSize��ʾ�����߳�,��˼�����㴴���̳߳ص�ʱ��ʹ��ڶ��ٸ��߳�;
        //maximumPoolSize:max��������,����߳�����;
        //keepAliveTime:keep���ǿ���,keepAliveTime���ǿ����̴߳���ʱ��;
        //unit:�ͱ�ʾ���ʱ��ĵ�λ��;
        //workQueue:���У��������corepoolsize��������������
        ThreadPoolExecutor pool = new ThreadPoolExecutor(1, 2, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(4));
        MyTask task1 = new MyTask(1, "����1");
        MyTask task2 = new MyTask(2, "����2");
        MyTask task3 = new MyTask(3, "����3");
        MyTask task4 = new MyTask(4, "����4");
        MyTask task5 = new MyTask(5, "����5");
        MyTask task6 = new MyTask(6, "����6");

        pool.execute(task1);
        pool.execute(task2);
        pool.execute(task3);
        pool.execute(task4);
        pool.execute(task5);
        //pool.execute(task6);û�з���ֵ������ִ�����񣬵��޷��ж������Ƿ�ɹ���ɡ�
        Future future = pool.submit(task6);//����һ��future�����������future���ж������Ƿ�ɹ���ɡ��뿴���棺
        if(future.get() == null){
            System.out.println("task6ִ�гɹ�");
        }
        pool.shutdown();
        //pool.shutdownNow();
    }

    static class MyTask implements Runnable {
        private int taskId;
        private String taskName;

        public MyTask(int taskId, String taskName) {
            this.taskId = taskId;
            this.taskName = taskName;
        }

        @Override
        public void run() {
            try {
                System.out.println("��ǰ�߳�Id-->" + taskId + ",��������-->" + taskName);
                Thread.sleep(1 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
