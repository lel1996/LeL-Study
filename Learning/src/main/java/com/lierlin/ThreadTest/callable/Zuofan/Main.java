package com.lierlin.ThreadTest.callable.Zuofan;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//�����н�����Կ���������ߴ������ʳ�Ĵ������첽ִ�еģ���������ִ����Ϻ󣬲�ִ�е��������롣
// ��ôΪʲô���߳�zuofanû����ִ���أ�����Future��get()����û�еõ�����ֵ���õ�ǰ�߳���ʱ�����ˡ�
//ע�⣺Future��get()����������ò��������������ǰ�̡߳�
public class Main {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        chuju cj = new chuju();
        shicai sc = new shicai();
        Future<Boolean> f1 = es.submit(cj);
        Future<Boolean> f2 = es.submit(sc);
        try {
            Boolean b1 = f1.get();//��������ǰ�߳�
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