package com.lierlin.leetCode;
//Trie除了可以用于字符串检索、前缀匹配外，还可以用于词频统计、字符串排序、搜索自动补全等场景。
public class 最长公共前缀 {
    public static void main(String[] args) {
        String str[]={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(str));
    }
    public static String longestCommonPrefix(String[] strs) {
        String str[] ={"flower", "flow", "flight"};
        String s = str[0];
        for (String string:str){
            while (!string.startsWith(s)){
                if (s.length()==0){
                    return "";
                }
                s = s.substring(0,s.length()-1);
            }
        }
        return s;
    }
}
