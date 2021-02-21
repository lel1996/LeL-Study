package com.annotation;

import com.annotation.factorybean.LierlinFactoryBean;
import com.annotation.factorybean.LierlinImportBeanDefinitionRegister;
import com.annotation.mapper.UserMapper;
import com.annotation.service.A;
import com.annotation.service.UserService;
import javafx.beans.binding.ObjectExpression;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@ComponentScan("com.annotation")
//@Import(LierlinFactoryBean.class)
@Import(LierlinImportBeanDefinitionRegister.class)
public class LIerlin {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(LIerlin.class);

        applicationContext.refresh();

      //new UserMapperProxy(UserMapper).getInstance();
       /* Object a =  applicationContext.getBean("&a");
        System.out.println(a);*/
        System.out.println(applicationContext.getBean("userService"));
        UserService u = (UserService) applicationContext.getBean("userService");
        u.test();
    }
}
