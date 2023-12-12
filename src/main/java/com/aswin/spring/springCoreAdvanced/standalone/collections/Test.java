package com.aswin.spring.springCoreAdvanced.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/aswin/spring/springCoreAdvanced/standalone/collections/config.xml");
		ProductsList productsList = (ProductsList)context.getBean("productsList");
		System.out.println(productsList);
	}

}
