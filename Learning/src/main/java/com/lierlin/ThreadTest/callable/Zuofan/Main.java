package com.lierlin.ThreadTest.callable.Zuofan;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//从运行结果可以看出，买出具代码和买食材代码是异步执行的，这两个都执行完毕后，才执行的做饭代码。
// 那么为什么子线程zuofan没有先执行呢？由于Future的get()方法没有得到返回值，让当前线程暂时挂起了。
//注意：Future的get()方法，如果拿不到结果会阻塞当前线程。
public class Main {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        chuju cj = new chuju();
        shicai sc = new shicai();
        Future<Boolean> f1 = es.submit(cj);
        Future<Boolean> f2 = es.submit(sc);
        try {
            Boolean b1 = f1.get();//会阻塞当前线程
            Boolean b2 = f2.get();
            System.out.println(b1);
            System.out.println(b2);
            if (b1 && b2) {
                zuofan zf = new zuofan();
                es.submit(zf);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        es.shutdown();
    }
}