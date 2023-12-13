package com.aswin.spring.springCoreAdvanced.injecting.interfaces;

public class OrderBOImpl implements OrderBO {

	private OrderDAO dao;

	@Override
	public void placeOrder() {
		System.out.println("Inside order BO impl");
		dao.createOrder();
	}

	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

}
