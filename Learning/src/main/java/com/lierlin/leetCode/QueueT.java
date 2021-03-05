package com.lierlin.leetCode;

import java.util.Stack;
/*queue ����
* boolean add(E e)
          ��ָ����Ԫ�ز���˶��У�������������Ҳ���Υ���������ƣ����ڳɹ�ʱ���� true�������ǰû�п��õĿռ䣬���׳� IllegalStateException��
 E element()
          ��ȡ�����ǲ��Ƴ��˶��е�ͷ��
 boolean offer(E e)
          ��ָ����Ԫ�ز���˶��У�������������Ҳ���Υ���������ƣ�����ʹ�����������ƵĶ���ʱ���˷���ͨ��Ҫ���� add(E)�����߿����޷�����Ԫ�أ���ֻ���׳�һ���쳣��
 E peek()
          ��ȡ�����Ƴ��˶��е�ͷ������˶���Ϊ�գ��򷵻� null��
 E poll()
          ��ȡ���Ƴ��˶��е�ͷ������˶���Ϊ�գ��򷵻� null��
 E remove()
          ��ȡ���Ƴ��˶��е�ͷ��

* */
class MyQueue {
    private Stack<Integer> a;// ����ջ
    private Stack<Integer> b;// ���ջ

    public MyQueue() {
        a = new Stack<>();
        b = new Stack<>();
    }

    public void push(int x) {
        a.push(x);
    }

    public int pop() {
        // ���bջΪ�գ���aջȫ��������ѹ��bջ�У�Ȼ��b.pop()
        if(b.isEmpty()){
            while(!a.isEmpty()){
                b.push(a.pop());
            }
        }
        return b.pop();
    }

    public int peek() {
        if(b.isEmpty()){
            while(!a.isEmpty()){
                b.push(a.pop());
            }
        }
        return b.peek();
    }

    public boolean empty() {
        return a.isEmpty() && b.isEmpty();
    }
}