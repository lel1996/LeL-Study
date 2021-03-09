package com.lierlin.leetCode.简单;

import java.util.Arrays;

public class 数组中出现次数超过一半的数字 {
    //Arrays.sort()对数组进行排序非常方便
    public static void main(String[] args) {
        int nums[]={1, 2, 3, 2, 2, 2, 5, 4, 2};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
