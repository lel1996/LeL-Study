package com.lierlin.ThreadTest.CyclicBarrier;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * ClassName:CountDownLatchTest <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015��7��30�� ����2:04:07 <br/>
 *
 * @author chiwei
 * @version
 * @since JDK 1.6
 * @see
 */
public class CyclicBarrierTest {

    public static void main(String[] args) {
        ThreadPoolExecutor poolExe = new ThreadPoolExecutor(100, 1000, 1, TimeUnit.SECONDS,
                new LinkedBlockingDeque<Runnable>(100));
        int count = 10;
        // ���Կ�ʼ�������𣬿��Կ�ʼ
        final CountDownLatch examBegin = new CountDownLatch(1);
        // �������������Խ�������
        final CyclicBarrier student = new CyclicBarrier(count+1);

        // һ������10λ����
        for (int i = 0; i < count; i++) {
            Runnable runnable = new Runnable() {
                public void run() {
                    try {
                        System.out.println("����" + Thread.currentThread().getName() + "�ڵȴ����Կ�ʼ����������");
                        examBegin.await();
                        System.out.println("������������" + Thread.currentThread().getName() + "��ʼ����");
                        Thread.sleep((long) (Math.random() * 100));//������̣�������ҵ���߼�������
                        System.out.println("����" + Thread.currentThread().getName() + "����");
                        student.await();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            poolExe.execute(runnable); // �˶�Ա��ʼ����
        }

        try {
            // ����ʱ��
            Thread.sleep((long) (Math.random() * 10000));
            System.out.println("����" + Thread.currentThread().getName() + "��ʼ������������");
            examBegin.countDown();
            System.out.println("����" + Thread.currentThread().getName() + "���Կ�ʼ��������");
            student.await(); // ���п�������
            System.out.println("����" + Thread.currentThread().getName() + "���Խ���");
        } catch (Exception e) {
            e.printStackTrace();
        }
        poolExe.shutdown();

    }

}