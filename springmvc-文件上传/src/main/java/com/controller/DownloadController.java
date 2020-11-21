package com.controller;

import com.controller.utils.Download;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class DownloadController{
/*    @Autowired
    private HttpServletRequest request;
    @Autowired
    private HttpServletResponse response;*/
    @RequestMapping("down")
    //如果不想每次都带request，response这两个参数，就用自动注入的方式。每一个请求的reqeust是隔离开的，底层用Threadlocal存储。
    public String down(HttpServletRequest request,HttpServletResponse response) throws Exception {
        Download.download("1","D:\\tmp\\upload__1a00b993_173802db362__7fc6_00000000.tmp",request,response);

        return "upload";
    }
}
