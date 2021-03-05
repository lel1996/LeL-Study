package com.lierlin.leetCode;

import java.util.HashSet;

public class 单一字符串 {
    public static void main(String[] args) {
        System.out.println(isUnique("lelelel"));
    }
    //利用hashset的不可重复性
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
