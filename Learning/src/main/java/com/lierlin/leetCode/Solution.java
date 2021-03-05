package com.lierlin.leetCode;
/*
* 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
示例:
给定 nums = [2, 7, 11, 15], target = 9
因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
* */
public class Solution {
    public static void main(String[] args) {
calc(10);

    }
    public static int calc(int a) {
        int n;
        n=a;
        try {
            n+=1;
            if(n/0 > 0) {
                n+=1;
            } else {
                n-=10;
            }
            return n;
        } catch(Exception e) {
            n++;
        }
        n++;
        return n++;
    }


    public int[] twoSum(int[] nums, int target) {
        int returnSize[]=new int[2];
        for(int j=0 ; j < nums.length; j++){
            for(int k = j+1 ; k < nums.length;k++){
                if(nums[j]+nums[k] == target){
                    returnSize[0] = j;
                    returnSize[1] = k;

                }

            }
        }
        return returnSize;
    }
}
