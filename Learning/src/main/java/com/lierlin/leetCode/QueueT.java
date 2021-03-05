package com.lierlin.leetCode;

import java.util.Stack;
/*queue 队列
* boolean add(E e)
          将指定的元素插入此队列（如果立即可行且不会违反容量限制），在成功时返回 true，如果当前没有可用的空间，则抛出 IllegalStateException。
 E element()
          获取，但是不移除此队列的头。
 boolean offer(E e)
          将指定的元素插入此队列（如果立即可行且不会违反容量限制），当使用有容量限制的队列时，此方法通常要优于 add(E)，后者可能无法插入元素，而只是抛出一个异常。
 E peek()
          获取但不移除此队列的头；如果此队列为空，则返回 null。
 E poll()
          获取并移除此队列的头，如果此队列为空，则返回 null。
 E remove()
          获取并移除此队列的头。

* */
class MyQueue {
    private Stack<Integer> a;// 输入栈
    private Stack<Integer> b;// 输出栈

    public MyQueue() {
        a = new Stack<>();
        b = new Stack<>();
    }

    public void push(int x) {
        a.push(x);
    }

    public int pop() {
        // 如果b栈为空，则将a栈全部弹出并压入b栈中，然后b.pop()
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