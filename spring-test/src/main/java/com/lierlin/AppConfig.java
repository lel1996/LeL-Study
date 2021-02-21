package com.lierlin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //@Configuration只有一个作用就是保证在类下面的所有Bean都是单例。
@ComponentScan("com.lierlin")
public class AppConfig {
    @Bean
    public Person person(){
        return new Person();
    }
}
