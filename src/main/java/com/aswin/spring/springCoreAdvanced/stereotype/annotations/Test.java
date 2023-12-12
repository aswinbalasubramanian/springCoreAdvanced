package com.aswin.spring.springCoreAdvanced.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/aswin/spring/springCoreAdvanced/stereotype/annotations/config.xml");
		Instructor instructor= (Instructor)context.getBean("instructor");
		System.out.println(instructor);
	}

}
