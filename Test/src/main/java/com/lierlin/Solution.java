package com.lierlin;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Solution {
    class Inner {
        public String  v1 = "Fake News";
        public String v2 = "Go ahead";
    }

    private static String GetVal() {
        try {
            return Inner.class.newInstance().v1;
        } catch (Exception e) {
            try {
                return Inner.class.getDeclaredConstructor(Solution.class).newInstance((Solution)null).v2;
            } catch (Exception ee) {
                ee.printStackTrace();
                return "Fake News, Go ahead";
            }
        }
    }
    public static void main(String[] args) {

        System.out.println(GetVal());
    }
}