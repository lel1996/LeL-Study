package com.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/*
* 1.拦截器是springmvc自己的，只有使用了springmvc的工厂才会使用
*   拦截器只是拦截访问控制器（controller）的请求
* */
@org.springframework.stereotype.Controller
@RequestMapping("hello")
public class Controller {
    //解决乱码的方式之一
    @RequestMapping(value = "hello", produces = "text/html;charset=utf-8")
    public String say() {
        return "hello";
    }
    //RestFul风格
    //普通->http://www.baidu.com?name=lierlin&age=22
    //restful->http://www.baidu.com/lierlin/22
    //在参数上增加@Path
    @RequestMapping(value = "hello", produces = "text/html;charset=utf-8")
    public String sleep(@PathVariable int a,@PathVariable int b) {
        return "hello"+a+b;
    }
    //如果配置了视图解析器 不用写forword默认已经写了
    @RequestMapping(value = "hello", produces = "text/html;charset=utf-8")
    public String forword(@PathVariable int a, @PathVariable int b, @RequestParam String c) {
        return "hello"+a+b;
    }
    //重定向
    @RequestMapping(value = "hello", produces = "text/html;charset=utf-8")
    public String direct(@PathVariable int a,@PathVariable int b) {
        return "redirect:/hello.jsp";
        //return "redirect:hello.do" hello.do是另一个请求
    }

    @RequestMapping(value = "eat")
    public String eat() {
        return "李二林真帅you";
    }
}
