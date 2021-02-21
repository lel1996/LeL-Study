package com.annotation.service;

import com.annotation.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public void test(){
        System.out.println(userMapper.selectById());
    }
}
