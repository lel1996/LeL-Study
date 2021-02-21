package com.annotation.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class A {
    @Resource
    private A a;
    public void update(){
        System.out.println("kekekekekekekek");
    }

}
