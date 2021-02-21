package com.lierlin;


import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        /*  ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person.getName());*/

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        //这里因为appconfig类上加了@Configuration被ConfigurationClassPostProcessor类扫描并进行cglib代理所以appconfig
        //变成了代理类，可以保证在appconfig配置类中@Bean的都是单例
        System.out.println(applicationContext.getBean(AppConfig.class).getClass());
        System.out.println(applicationContext.getBean("person"));
        System.out.println(applicationContext.getBean("userService"));
        System.out.println(applicationContext.getBean("userService").getClass());
        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
        beanDefinition.setBeanClass(A.class);
        //beanDefinition.setBeanClassName("lierlin");
        applicationContext.registerBeanDefinition("lierlin",beanDefinition);
        System.out.println("lierlin"+applicationContext.getBean("lierlin"));
        /*Person person = (Person) applicationContext.getBean("person");
        System.out.println(person.getName());*/
    }
}
