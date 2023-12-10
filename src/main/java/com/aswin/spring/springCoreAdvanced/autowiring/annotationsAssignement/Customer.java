package com.aswin.spring.springCoreAdvanced.autowiring.annotationsAssignement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {
	@Autowired
	@Qualifier("reserve456")
	private Reservation reservation;
	private String name;

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [reservation=" + reservation + ", name=" + name + "]";
	}
}
