package com.naissur.jsf.methodsOnBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CounterThree {
	private int value;
	
	// create no-args constructor
	
	public CounterThree() {
		value = 0;
	}

	// methods
	
	public String increment() {
		value++;
		return "counter_three";
	}
	
	// generate getter and setter methods for the field
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
