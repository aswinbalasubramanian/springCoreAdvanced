package com.aswin.spring.springCoreAdvanced.stereotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst")
@Scope("prototype")
public class Instructor {

	@Value("01")
	private int id=10;

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + "]";
	}

	@Value("Ultimate Warrior")
	private String name="Person 1";

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
