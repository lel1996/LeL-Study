package com.lierlin.leetCode;
/*
* ����һ���������� nums ��һ��Ŀ��ֵ target�������ڸ��������ҳ���ΪĿ��ֵ���� ���� ���������������ǵ������±ꡣ
����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ�������ͬһ��Ԫ�ز���ʹ�����顣
ʾ��:
���� nums = [2, 7, 11, 15], target = 9
��Ϊ nums[0] + nums[1] = 2 + 7 = 9
���Է��� [0, 1]
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
