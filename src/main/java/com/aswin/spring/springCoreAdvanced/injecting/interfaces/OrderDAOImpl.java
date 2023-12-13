package com.aswin.spring.springCoreAdvanced.injecting.interfaces;

public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside OrderDAO Impl  - createOrder");

	}

}
