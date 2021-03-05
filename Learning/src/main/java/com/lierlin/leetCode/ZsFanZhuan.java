package com.lierlin.leetCode;

import javafx.beans.property.StringPropertyBase;
/*
*   public int reverse(int x) {
        long n = 0;
        while(x != 0) {
            n = n*10 + x%10;
            x = x/10;
        }
        return (int)n==n? (int)n:0;
    }
* */
public class ZsFanZhuan {
    public static void main(String[] args) {
        System.out.println(reverse(-123));
       // System.out.println(-2^31);
    }
    public static int reverse(int x) {
        if(Math.pow(-2,31)>x || x>(Math.pow(2,31)-1)){
            return 0;
        }else if(x>(2^31-1)){
            char[] a = Integer.toString(x).toCharArray();
            String b ="";
            for (int i =a.length-1;i>=0;i--){
                b+=a[i];
            }
            return Integer.parseInt(b);
        }
        else if(x>Math.pow(-2,31)){
            char[] a = Integer.toString(x).toCharArray();
            String b ="";
            for (int i =a.length-1;i>=1;i--){
                b+=a[i];
            }
            int c = Integer.valueOf(b);
            return -c;
        }
        return 1;
    }
}
