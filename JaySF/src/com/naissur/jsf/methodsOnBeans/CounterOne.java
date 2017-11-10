package com.naissur.jsf.methodsOnBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CounterOne {
	private int value;
	
	// create no-args constructor
	
	public CounterOne() {
		value = 0;
	}

	// methods
	
	public String increment() {
		value++;
		return "counter_one";
	}
	
	// generate getter and setter methods for the field
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
