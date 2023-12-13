package com.aswin.spring.springCoreAdvanced.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component
public class OrderDAOImpl2 implements OrderDAO {

	@Override
	public void createOrder() {
		// TODO Auto-generated method stub
		System.out.println("Inside createOrder DAO2 Impl");
	}

}
