package com.lierlin;

import java.math.*;
public class ShowMeBug {
    public static void main(String[] args) {
        System.out.println("΢�ź���㷨��");
        dealRedPackage(13.14,7);
    }
    //�벹�����к�������
    public static void dealRedPackage(double money,int n){
        //�������0��Money/n * 2��
        double sum = (int) (money * 100);//����100��
        int shuliang =n;
        while(shuliang!=1) {//���ʣ1��������ֱ�ӷ��ؾ������
            shuliang--;
            double hongbao = Math.random() % (sum / shuliang * 2 -3)+1;
            sum -= hongbao*100;//�ܶ��ȥ�Ѿ����ߵĽ�
            n--;
            System.out.println(hongbao);//�任��С��
        }
        System.out.println(sum*1.0/100);//���ʣ�µ�һ��
    }
}