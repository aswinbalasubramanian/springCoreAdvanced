package com.aswin.spring.springCoreAdvanced.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst")
@Scope("prototype")
public class Instructor {

	@Value("#{T(java.lang.Integer).MIN_VALUE}")
	private int id = 10;

	@Value("#{topics}")
	private List<String> topics;

	@Autowired
	private Profile profile;

	@Value("#{3+4>8?true:false}")
	private boolean active;

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", topics=" + topics + ", profile=" + profile + ", active=" + active + ", name="
				+ name + "]";
	}

	@Value("Ultimate Warrior")
	private String name = "Person 1";

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

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}
