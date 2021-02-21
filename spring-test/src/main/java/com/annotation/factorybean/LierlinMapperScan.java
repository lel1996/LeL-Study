package com.annotation.factorybean;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;

public class LierlinMapperScan extends ClassPathBeanDefinitionScanner {
    public LierlinMapperScan(BeanDefinitionRegistry registry) {
        super(registry);
    }
}
