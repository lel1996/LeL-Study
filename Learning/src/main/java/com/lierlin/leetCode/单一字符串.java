package com.lierlin.leetCode;

import java.util.HashSet;

public class ��һ�ַ��� {
    public static void main(String[] args) {
        System.out.println(isUnique("lelelel"));
    }
    //����hashset�Ĳ����ظ���
    public static boolean isUnique(String astr) {
        HashSet<Character> set = new HashSet<>();
        for(char c : astr.toCharArray()){
            if(!set.add(c)) {
                return false;
            }
        }
        return true;

    }
}
