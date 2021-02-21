package com.lierlin.ThreadTest.threadpool;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //corePoolSize表示核心线程,意思就是你创建线程池的时候就存在多少个线程;
        //maximumPoolSize:max嘛就是最大,最大线程数量;
        //keepAliveTime:keep就是空闲,keepAliveTime就是空闲线程存活的时间;
        //unit:就表示存活时间的单位了;
        //workQueue:队列，用来存放corepoolsize处理不过来的任务
        ThreadPoolExecutor pool = new ThreadPoolExecutor(1, 2, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(4));
        MyTask task1 = new MyTask(1, "任务1");
        MyTask task2 = new MyTask(2, "任务2");
        MyTask task3 = new MyTask(3, "任务3");
        MyTask task4 = new MyTask(4, "任务4");
        MyTask task5 = new MyTask(5, "任务5");
        MyTask task6 = new MyTask(6, "任务6");

        pool.execute(task1);
        pool.execute(task2);
        pool.execute(task3);
        pool.execute(task4);
        pool.execute(task5);
        //pool.execute(task6);没有返回值。可以执行任务，但无法判断任务是否成功完成。
        Future future = pool.submit(task6);//返回一个future。可以用这个future来判断任务是否成功完成。请看下面：
        if(future.get() == null){
            System.out.println("task6执行成功");
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
                System.out.println("当前线程Id-->" + taskId + ",任务名称-->" + taskName);
                Thread.sleep(1 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
