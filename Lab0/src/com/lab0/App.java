package com.lab0;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
        HelloWorld obj = (HelloWorld) context.getBean("greeter");
        
        obj.getName();
        
        obj.getGreeting();
        
	}

}
