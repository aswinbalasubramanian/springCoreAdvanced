package com.aswin.spring.springCoreAdvanced.autowiring.annotationsAssignement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/aswin/spring/springCoreAdvanced/autowiring/annotationsAssignement/config.xml");
		Customer cust = (Customer)context.getBean("customer");
		System.out.println(cust);
	}

}
