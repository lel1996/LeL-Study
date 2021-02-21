package com.lierlin;

import lombok.Synchronized;

import java.util.concurrent.locks.ReentrantLock;

public class TestJob {

/*    public boolean doJob() {
// TODO  控制任务并发

// 执行业务逻辑
        process();
        return true;
    }

    // 执行业务逻辑
    private void process() {
//....
    }*/
public static void main(String[] args) {
    new Thread(()->{

    }).start();
}

}
