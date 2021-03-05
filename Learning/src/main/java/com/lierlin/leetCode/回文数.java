package com.lierlin.leetCode;

public class »ØÎÄÊý {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome1(232));
    }

    public static boolean isPalindrome(int x) {
        StringBuilder s = new StringBuilder();
        StringBuilder d = new StringBuilder();
        StringBuilder b = s.append(String.valueOf(x));
        StringBuilder c = d.append(String.valueOf(x)).reverse();
        System.out.println(b + "------" + c);
        if (b.toString().equals(c.toString())) {
            return true;
        } else
            return false;

    }

    public static boolean isPalindrome1(int x) {
        if (x<0)
            return false;
        int sum =0;
        int a =0;
        int jieguo = x;
        while (jieguo!=0){
            a=jieguo%10;
            sum = sum*10+a;
            jieguo=jieguo/10;
        }
        return x==sum;
    }
}

