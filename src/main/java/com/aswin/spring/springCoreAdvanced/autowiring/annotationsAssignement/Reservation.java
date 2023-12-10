package com.aswin.spring.springCoreAdvanced.autowiring.annotationsAssignement;

public class Reservation {

	private int id;
	private String time;

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", time=" + time + "]";
	}
}
