package com.lierlin.leetCode;

import java.util.Stack;


/*
* boolean empty()
          ���Զ�ջ�Ƿ�Ϊ�ա�
 E peek()
          �鿴��ջ�����Ķ��󣬵����Ӷ�ջ���Ƴ�����
 E pop()
          �Ƴ���ջ�����Ķ��󣬲���Ϊ�˺�����ֵ���ظö���
 E push(E item)
          ����ѹ���ջ������
 int search(Object o)
          ���ض����ڶ�ջ�е�λ�ã��� 1 Ϊ������

*/



public class StackT {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        System.out.println(stack.peek());
    }
}
