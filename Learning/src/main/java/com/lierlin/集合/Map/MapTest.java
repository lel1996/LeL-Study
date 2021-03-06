package com.lierlin.集合.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

public class MapTest {
    private final static Logger logger = LoggerFactory.getLogger(MapTest.class);
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Map map1 = new ConcurrentHashMap(32);
        System.out.println(0x7fffffff);
        for (int i = 0; i < 4; i++) {
            map.put("map" + i, "map" + i);

        }
        MapTest mapTest = new MapTest();
        mapTest.one(map);
        mapTest.two(map);
        mapTest.three(map);
        mapTest.four(map);
        mapTest.five(map);
    }

    public void one(Map<String, String> map) {
        System.out.println("第一种方法:获取map中的所有值，但是得不到map中的key");
        logger.debug("123456");
        for (String value : map.values()) {
            System.out.println("value:" + value);
        }
    }

    public void two(Map<String, String> map) {
        System.out.println("------------------------------");
        System.out.println("第二中方法:最常用的方法循环map中的key,循环每个key获取对应的值");
        for (String key : map.keySet()) {
            System.out.println("key:" + key + "------------>value:" + map.get(key));
        }

    }

    public void three(Map<String, String> map) {
        System.out.println("----------------------------");
        System.out.println("第三种方法:将map转换成set集合，使用增强for直接遍历集合中的数据");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key:" + entry.getKey() + "---------->value" + entry.getValue());
        }
    }

    public void four(Map<String, String> map) {
        System.out.println("--------------------------");
        System.out.println("第四种方法:将map转换成set集合,使用set的迭代器，可以在不知道key的情况下遍历Map对象");
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = (Map.Entry<String, String>) iterator.next();
            System.out.println("key:" + entry.getKey() + "-------->value:" + entry.getValue());

        }
    }

    public void five(Map<String,String> map){
        System.out.println("-------------------------------");
        System.out.println("第五种方法：用jdk8新特性遍历map集合");
        map.forEach((k,v)->System.out.println("key: "+ k +"-------->value: "+v));
    }

}
