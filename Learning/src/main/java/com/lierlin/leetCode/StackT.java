package com.lierlin.leetCode;

import java.util.Stack;


/*
* boolean empty()
          测试堆栈是否为空。
 E peek()
          查看堆栈顶部的对象，但不从堆栈中移除它。
 E pop()
          移除堆栈顶部的对象，并作为此函数的值返回该对象。
 E push(E item)
          把项压入堆栈顶部。
 int search(Object o)
          返回对象在堆栈中的位置，以 1 为基数。

*/



public class StackT {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        System.out.println(stack.peek());
    }
}
