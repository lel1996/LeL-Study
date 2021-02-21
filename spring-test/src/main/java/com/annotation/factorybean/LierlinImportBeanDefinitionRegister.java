package com.annotation.factorybean;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class LierlinImportBeanDefinitionRegister implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

        //…®√Ë
        String path = "com.annotation.mapper";
        LierlinMapperScan lierlinMapperScan =new LierlinMapperScan(registry);
        int scan = lierlinMapperScan.scan(path);
        System.out.println(scan);

        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
        beanDefinition.setBeanClass(LierlinFactoryBean.class);
        registry.registerBeanDefinition("aaa",beanDefinition);
    }
}
