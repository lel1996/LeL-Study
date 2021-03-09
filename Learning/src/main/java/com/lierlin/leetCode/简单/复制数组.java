package com.lierlin.leetCode.简单;

import java.util.Arrays;

public class 复制数组 {

    /*5个参数，
第一个参数是要被复制的数组
第二个参数是被复制的数字开始复制的下标
第三个参数是目标数组，也就是要把数据放进来的数组
第四个参数是从目标数据第几个下标开始放入数据
第五个参数表示从被复制的数组中拿几个数值放到目标数组中

比如：
数组1：int[] arr = { 1, 2, 3, 4, 5 };
数组2：int[] arr2 = { 5, 6,7, 8, 9 };
运行：System.arraycopy(arr, 1, arr2, 0, 3);
得到：
int[] arr2 = { 2, 3, 4, 8, 9 };
————————————————
版权声明：本文为CSDN博主「峥嵘life」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/wenzhi20102321/article/details/78444158*/
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int brr[]=new int[5];
        System.arraycopy(arr,0,brr,0,arr.length);
        for (int i = 0; i <brr.length ; i++) {
            System.out.println(brr[i]);
        }
        //三、使用Arrays类的copyOf()方法和copyOfRange()方法
        int[] numbers={1,2,3};
        int[] newL = Arrays.copyOf(numbers,3);
        System.out.println(newL);

        int[] letter= {'a','b','c','d','e','f'};
        System.out.println(Arrays.copyOfRange(letter,1,4));
    }
    }

