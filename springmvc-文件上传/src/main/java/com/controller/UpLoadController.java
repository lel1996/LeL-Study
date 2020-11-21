package com.controller;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.sun.istack.internal.logging.Logger;

@Controller
public class UpLoadController {
    private static final Log logger = LogFactory.getLog(UpLoadController.class);

    @RequestMapping(value = "/upload", method = RequestMethod.GET)
    public String showLoad() {
        return "upload";
    }
    @RequestMapping(value = "/doUpload", method = RequestMethod.POST)
    public String doUpLoad(@RequestParam("name") String name,@RequestParam("file") MultipartFile file) throws IOException {
        logger.debug("当前输入文件是：" + file.getOriginalFilename());
        String original = file.getOriginalFilename();
        {
            FileUtils.copyInputStreamToFile(file.getInputStream(), new File("C:\\Users\\lierlin\\Desktop\\ll", name + original));
        }
        return "success";
    }


}