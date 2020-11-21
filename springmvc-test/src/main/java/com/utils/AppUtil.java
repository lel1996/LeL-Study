package com.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import java.nio.charset.StandardCharsets;
import java.util.List;

@Component
public class AppUtil implements ApplicationContextAware, ApplicationListener<ContextRefreshedEvent> {
    private ApplicationContext app;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.app = applicationContext;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        try {
            RequestMappingHandlerAdapter requestMappingHandlerAdapter = app.getBean(RequestMappingHandlerAdapter.class);
            if(requestMappingHandlerAdapter!=null) {
                List<HttpMessageConverter<?>> messageConverters = requestMappingHandlerAdapter.getMessageConverters();
                if(messageConverters!=null) {
                    // 获取bean容器中的StringHttpMessageConverter，并修改DefaultCharset属性
                    for(HttpMessageConverter item : messageConverters) {
                        if(item instanceof StringHttpMessageConverter) {
                            ((StringHttpMessageConverter) item).setDefaultCharset(StandardCharsets.UTF_8);
                        }
                    }
                }
            }
        }catch (BeansException e) {

        }
    }
}
