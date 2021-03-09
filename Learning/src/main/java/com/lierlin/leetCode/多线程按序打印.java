package com.lierlin.leetCode;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
//1����Conditionʵ��
/*class Foo {
    int num;
    Lock lock;
    //��ȷ��֪ͨ�ͻ����߳�
    Condition condition1, condition2, condition3;

    public Foo() {
        num = 1;
        lock = new ReentrantLock();
        condition1 = lock.newCondition();
        condition2 = lock.newCondition();
        condition3 = lock.newCondition();
    }

    public void first(Runnable printFirst) throws InterruptedException {
        lock.lock();
        try {
            while (num != 1) {
                condition1.await();
            }
            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            num = 2;
            condition2.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        lock.lock();
        try {
            while (num != 2) {
                condition2.await();
            }
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            num = 3;
            condition3.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        lock.lock();
        try {
            while (num != 3) {
                condition3.await();
            }
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
            num = 1;
            condition1.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}*/
//2���ź���ʵ��
import java.util.concurrent.Semaphore;

/*class Foo {

    Semaphore semaphore12, semaphore23;

    public Foo() {
        //��ʼ�������������Ϊ0
        semaphore12 = new Semaphore(0);
        semaphore23 = new Semaphore(0);
    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        //�ͷ�һ��12���ź���
        semaphore12.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        //��ȡһ��12���ź�����û��������
        semaphore12.acquire();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        //�ͷ�һ��23���ź���
        semaphore23.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        //��ȡһ��23���ź�����û��������
        semaphore23.acquire();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}*/

//����CountDownLatch(����������)
//һ������Ӧ�ó�����������һ������ʱ�����߳���Ҫ�ȴ�������������ϣ�֮���ټ���ִ�С�
import java.util.concurrent.CountDownLatch;

/*class Foo {

    CountDownLatch countDownLatch12, countDownLatch23;

    public Foo() {
        countDownLatch12 = new CountDownLatch(1);
        countDownLatch23 = new CountDownLatch(1);
    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        countDownLatch12.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        //�ȴ�����������������ִ��
        countDownLatch12.await();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        countDownLatch23.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {
        //�ȴ�����������������ִ��
        countDownLatch23.await();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}*/


//�ģ� ��������

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

class Foo {
    BlockingQueue<String> blockingQueue12, blockingQueue23;

    public Foo() {
        //ͬ������,û����������ȥһ��Ԫ�أ�����ȴ�ȡ�����Ժ󣬲������������һ��Ԫ��
        blockingQueue12 = new SynchronousQueue<>();
        blockingQueue23 = new SynchronousQueue<>();
    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        blockingQueue12.put("stop");
    }

    public void second(Runnable printSecond) throws InterruptedException {
        blockingQueue12.take();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        blockingQueue23.put("stop");
    }

    public void third(Runnable printThird) throws InterruptedException {
        blockingQueue23.take();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}





public class ���̰߳����ӡ {

}
