package com.aswin.spring.springCoreAdvanced.stereotype.annotations;

import org.springframework.stereotype.Component;

@Component("inst")
public class Instructor {

	private int id;

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + "]";
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
