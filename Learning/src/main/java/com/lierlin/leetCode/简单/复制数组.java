package com.lierlin.leetCode.��;

import java.util.Arrays;

public class �������� {

    /*5��������
��һ��������Ҫ�����Ƶ�����
�ڶ��������Ǳ����Ƶ����ֿ�ʼ���Ƶ��±�
������������Ŀ�����飬Ҳ����Ҫ�����ݷŽ���������
���ĸ������Ǵ�Ŀ�����ݵڼ����±꿪ʼ��������
�����������ʾ�ӱ����Ƶ��������ü�����ֵ�ŵ�Ŀ��������

���磺
����1��int[] arr = { 1, 2, 3, 4, 5 };
����2��int[] arr2 = { 5, 6,7, 8, 9 };
���У�System.arraycopy(arr, 1, arr2, 0, 3);
�õ���
int[] arr2 = { 2, 3, 4, 8, 9 };
��������������������������������
��Ȩ����������ΪCSDN���������life����ԭ�����£���ѭCC 4.0 BY-SA��ȨЭ�飬ת���븽��ԭ�ĳ������Ӽ���������
ԭ�����ӣ�https://blog.csdn.net/wenzhi20102321/article/details/78444158*/
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int brr[]=new int[5];
        System.arraycopy(arr,0,brr,0,arr.length);
        for (int i = 0; i <brr.length ; i++) {
            System.out.println(brr[i]);
        }
        //����ʹ��Arrays���copyOf()������copyOfRange()����
        int[] numbers={1,2,3};
        int[] newL = Arrays.copyOf(numbers,3);
        System.out.println(newL);

        int[] letter= {'a','b','c','d','e','f'};
        System.out.println(Arrays.copyOfRange(letter,1,4));
    }
    }

