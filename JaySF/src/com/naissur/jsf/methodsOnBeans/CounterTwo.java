package com.naissur.jsf.methodsOnBeans;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class CounterTwo {
	private int value;

	// generate no-args constructor
	
	public CounterTwo() {
		value = 0;
	}

	// methods
	
	public String increment() {
		value++;
		return "counter_two";
	}
	
	// generate getters and setters for the field

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
