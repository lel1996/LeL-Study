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
    //�������ÿ�ζ���request��response�����������������Զ�ע��ķ�ʽ��ÿһ�������reqeust�Ǹ��뿪�ģ��ײ���Threadlocal�洢��
    public String down(HttpServletRequest request,HttpServletResponse response) throws Exception {
        Download.download("1","D:\\tmp\\upload__1a00b993_173802db362__7fc6_00000000.tmp",request,response);

        return "upload";
    }
}
