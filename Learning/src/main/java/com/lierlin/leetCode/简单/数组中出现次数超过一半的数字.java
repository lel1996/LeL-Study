package com.lierlin.leetCode.��;

import java.util.Arrays;

public class �����г��ִ�������һ������� {
    //Arrays.sort()�������������ǳ�����
    public static void main(String[] args) {
        int nums[]={1, 2, 3, 2, 2, 2, 5, 4, 2};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
