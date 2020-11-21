package com.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/*
* 1.��������springmvc�Լ��ģ�ֻ��ʹ����springmvc�Ĺ����Ż�ʹ��
*   ������ֻ�����ط��ʿ�������controller��������
* */
@org.springframework.stereotype.Controller
@RequestMapping("hello")
public class Controller {
    //�������ķ�ʽ֮һ
    @RequestMapping(value = "hello", produces = "text/html;charset=utf-8")
    public String say() {
        return "hello";
    }
    //RestFul���
    //��ͨ->http://www.baidu.com?name=lierlin&age=22
    //restful->http://www.baidu.com/lierlin/22
    //�ڲ���������@Path
    @RequestMapping(value = "hello", produces = "text/html;charset=utf-8")
    public String sleep(@PathVariable int a,@PathVariable int b) {
        return "hello"+a+b;
    }
    //�����������ͼ������ ����дforwordĬ���Ѿ�д��
    @RequestMapping(value = "hello", produces = "text/html;charset=utf-8")
    public String forword(@PathVariable int a, @PathVariable int b, @RequestParam String c) {
        return "hello"+a+b;
    }
    //�ض���
    @RequestMapping(value = "hello", produces = "text/html;charset=utf-8")
    public String direct(@PathVariable int a,@PathVariable int b) {
        return "redirect:/hello.jsp";
        //return "redirect:hello.do" hello.do����һ������
    }

    @RequestMapping(value = "eat")
    public String eat() {
        return "�������˧you";
    }
}
