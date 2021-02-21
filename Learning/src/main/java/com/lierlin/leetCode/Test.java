package com.lierlin.leetCode;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;


public class Test {
    static AtomicReference<String> jieguo = new AtomicReference<>("");
    static volatile boolean flagg = false;

    public static void main(String[] args) throws InterruptedException {
        int nums[] = {1, 2, 3, 4, 5};

        Thread t2 = new Thread(() -> {
            while (true) {
                if (jieguo.get() == "true") {
                    flagg = true;
                    break;
                }
            }
        });
        t2.start();
        checkTwoSum(nums, 100);
        Thread.currentThread().sleep(100);
        if (flagg != true) {
            flagg = false;
        }
        System.out.println(flagg);
        Thread.currentThread().interrupt();
    }

    public static void checkTwoSum(int[] nums, int k) {
        if (nums.length >= 2) {
            Arrays.stream(nums).forEach(item -> {
                int a = k - item;
                boolean b = bijiao(nums, a);
                if (b) {
                    jieguo.set("true");

                } else jieguo.set("false");
            });
        }
        //return jieguo;
    }

    static boolean bijiao(int[] nums, int b) {
        for (int i = 0; i < nums.length; i++) {
            if (b == nums[i]) {
                return true;
            }
        }
        return false;
    }
}
