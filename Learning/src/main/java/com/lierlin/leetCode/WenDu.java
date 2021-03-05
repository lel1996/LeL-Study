package com.lierlin.leetCode;

import java.util.Scanner;

public class WenDu {
    public static void main(String[] args) {
        int arr[][]={{3,4,5,6,6},{2,3,4,5,6},{1,2,3,4},{2,3,4,5},{8,7,6,5},{2,5,8,9},{2,4,5,1}};
        Scanner scanner = new Scanner(System.in);
        int tian =scanner.nextInt()-1;
        float sum=0;
        for (int i = 0; i <arr[tian].length; i++) {
                sum+=arr[tian][i];
        }
        System.out.println("今天的平均温度为："+sum/arr[tian].length+" 度");
    }
}
