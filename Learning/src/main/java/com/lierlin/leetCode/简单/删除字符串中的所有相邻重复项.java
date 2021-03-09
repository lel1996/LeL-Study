package com.lierlin.leetCode.��;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ɾ���ַ����е����������ظ��� {
    public static void main(String[] args) {
        //System.out.println(removeDuplicates("abbacddc"));
      /* StringBuilder sb=new StringBuilder();
        sb.append("a");
        sb.append("a");
        sb.append("b");
        sb.append("b");
        sb.append("c");
        System.out.println(sb.length());
        System.out.println(sb.charAt(0));
        System.out.println(sb.charAt(1));
        sb.deleteCharAt(0);
        System.out.println(sb.charAt(0));
        System.out.println(sb.charAt(1));
        System.out.println(sb.toString());*/
        //System.out.println(removeDuplicates("abbacddc"));
        //System.out.println(removeDuplicates("aabbccd"));
    }

   /*     public static String removeDuplicates(String S) {
            if (1 <= S.length()&& S.length()<= 20000){
            int next  = 1;
            int now = S.length();
            while (now!=next){
                now =  S.length();
                S=S.replace("aa","").replace("bb","").replace("cc","").replace("dd","").replace("ee","").replace("ff","").replace("gg","").replace("hh","").replace("ii","").replace("jj","").replace("kk","").replace("ll","").replace("mm","").replace("nn","").replace("oo","").replace("pp","").replace("qq","").replace("rr","").replace("ss","").replace("tt","").replace("uu","").replace("vv","").replace("ww","").replace("xx","").replace("yy","").replace("zz","");
                next =  S.length();
            }

                return S;
            }
            else {
                return null;
            }

        }*/

    //����ջ�����
/*    public static String removeDuplicates(String S) {
        *//* ֻ��ɾ���ظ���ɣ���˿���ʹ��ջʵ��
         * ÿ�����ʱ�Ƚ��Ƿ���ջ��Ԫ����ͬ
         *   - ����ͬ��ɾ��ջ��Ԫ���Ҳ�����
         *   - ������ͬ�������Ԫ��
         * ʱ�临�Ӷȣ�O(N)
         * �ռ临�Ӷȣ�O(N)
         *//*
        char[] s = S.toCharArray();
        int len = s.length;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            if (stack.isEmpty() || s[i] != stack.peek()) {
                stack.push(s[i]);
            } else {
                stack.pop();
            }
        }
        *//* ���ݵ�չʾ���Լ����Ż� *//*
        StringBuilder str = new StringBuilder();
        for (Character c : stack) {
            str.append(c);
        }
        return str.toString();

    }*/
    static String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder();
        for (char c : S.toCharArray()) {
            int len = sb.length();
            if (len > 0 && sb.charAt(len - 1) == c) {
                System.out.println(sb.toString());
                sb.deleteCharAt(len - 1);
                continue;
            }
            sb.append(c);
        }
        return sb.toString();
    }
    }

