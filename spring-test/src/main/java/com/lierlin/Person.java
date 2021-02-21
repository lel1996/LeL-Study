package com.lierlin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Person {

    public Person(){
        System.out.println("Person 对象被实例化了");

    }
    @Value("lierlin")
    private String name;
    @Value("14")
    private int age;
}
