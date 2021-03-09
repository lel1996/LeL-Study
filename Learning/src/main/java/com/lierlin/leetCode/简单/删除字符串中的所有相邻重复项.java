package com.lierlin.leetCode.简单;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 删除字符串中的所有相邻重复项 {
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

    //利用栈来解决
/*    public static String removeDuplicates(String S) {
        *//* 只需删除重复项即可，因此可以使用栈实现
         * 每次添加时比较是否与栈顶元素相同
         *   - 若相同则删除栈顶元素且不插入
         *   - 若不相同则插入新元素
         * 时间复杂度：O(N)
         * 空间复杂度：O(N)
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
        *//* 数据的展示可以继续优化 *//*
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

