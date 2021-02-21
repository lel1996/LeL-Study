package com.lierlin;

import java.math.*;
public class ShowMeBug {
    public static void main(String[] args) {
        System.out.println("微信红包算法：");
        dealRedPackage(13.14,7);
    }
    //请补充下列函数内容
    public static void dealRedPackage(double money,int n){
        //随机区域（0，Money/n * 2）
        double sum = (int) (money * 100);//扩大100倍
        int shuliang =n;
        while(shuliang!=1) {//如果剩1个不计算直接返回就是余额
            shuliang--;
            double hongbao = Math.random() % (sum / shuliang * 2 -3)+1;
            sum -= hongbao*100;//总额减去已经领走的金额；
            n--;
            System.out.println(hongbao);//变换成小树
        }
        System.out.println(sum*1.0/100);//输出剩下的一个
    }
}