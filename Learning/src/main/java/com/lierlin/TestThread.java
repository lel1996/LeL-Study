package com.lierlin;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j(topic = "TestThread")
public class TestThread {
	static Object lock = new Object();
	static int count = 0;

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
	
		// TODO Auto-generated method stub
		ThreadLocal<String> to = new ThreadLocal<String>();
		//to.set("lierlin");
		System.out.println("to.get() is"+to.get());
		log.debug("running");
		Map map= new HashMap();
		Map map1= new ConcurrentHashMap();
		map.put("leirlin", 123);
		System.out.println(1 << 4);
		System.out.println(1 << 30);
		int a = 50;
		int b=1;
		while(b>=1){
			b--;
			a=10;
		}
		Thread.interrupted();
		System.out.print(a);
		
	
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
	for(int i=0;i<=5000;i++)
		synchronized(lock)
				{count++;}
			}
		});	Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
	for(int i=0;i<=5000;i++)
		synchronized(lock)
		{count--;}
			}
		});

		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(count);
		
	}

	
}
