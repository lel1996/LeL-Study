package com.lierlin.leetCode;
//Trie���˿��������ַ���������ǰ׺ƥ���⣬���������ڴ�Ƶͳ�ơ��ַ������������Զ���ȫ�ȳ�����
public class �����ǰ׺ {
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
