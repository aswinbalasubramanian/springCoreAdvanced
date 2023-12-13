package com.aswin.spring.springCoreAdvanced.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/aswin/spring/springCoreAdvanced/injecting/interfaces/config.xml");
		OrderBO orderbo = (OrderBO) context.getBean("bo");
		System.out.println(orderbo);
		orderbo.placeOrder();

	}

}
