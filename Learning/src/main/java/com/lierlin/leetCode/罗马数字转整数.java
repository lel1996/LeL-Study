package com.lierlin.leetCode;

public class 罗马数字转整数 {
    public static void main(String[] args) {
        System.out.println(romanToInt("VIV"));
    }

    public static int romanToInt(String s) {
        int n = s.length();
        int roman_int = 0;
        for(int i=0;i<n;i++)
        {
            switch(s.charAt(i))
            {
                case 'I' : roman_int = roman_int + 1;break;
                case 'V' : roman_int = roman_int + 5;break;
                case 'X' : roman_int = roman_int + 10;break;
                case 'L' : roman_int = roman_int + 50;break;
                case 'C' : roman_int = roman_int + 100;break;
                case 'D' : roman_int = roman_int + 500;break;
                case 'M' : roman_int = roman_int + 1000;break;
                default: System.out.println("default");break;
            }

            if(i!=0)
            {
                if(((s.charAt(i)=='V')||(s.charAt(i)=='X'))&&(s.charAt(i-1)=='I'))
                    roman_int = roman_int-1*2;
                if(((s.charAt(i)=='L')||(s.charAt(i)=='C'))&&(s.charAt(i-1)=='X'))
                    roman_int = roman_int-10*2;
                if(((s.charAt(i)=='D')||(s.charAt(i)=='M'))&&(s.charAt(i-1)=='C'))
                    roman_int = roman_int-100*2;
            }
        }
        return roman_int;
    }


    static  int resTow(String s){
        s = s.replace("IV","a");
        s = s.replace("IX","b");
        s = s.replace("XL","c");
        s = s.replace("XC","d");
        s = s.replace("CD","e");
        s = s.replace("CM","f");

        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res += getValue(s.charAt(i));
        }
        return res;
    }

    public static int getValue(char c) {
        switch(c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            case 'a': return 4;
            case 'b': return 9;
            case 'c': return 40;
            case 'd': return 90;
            case 'e': return 400;
            case 'f': return 900;
        }
        return 0;
    }
}
