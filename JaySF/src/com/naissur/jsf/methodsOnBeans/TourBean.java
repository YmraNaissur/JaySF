package com.naissur.jsf.methodsOnBeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TourBean {
	private String kindOfTour;
	private List<String> tourKinds; // selectOneMenu items list

	// create no-args constructor
	
	public TourBean() {
		tourKinds = new ArrayList<>();
		tourKinds.add("City");
		tourKinds.add("Country");
	}

	// create getter and setter methods for the fields
	
	public String getKindOfTour() {
		return kindOfTour;
	}

	public void setKindOfTour(String kindOfTour) {
		this.kindOfTour = kindOfTour;
	}
	
	public List<String> getTourKinds() {
		return tourKinds;
	}
	
	// methods
	
	public String startTheTour() {
		if (kindOfTour != null && kindOfTour.equalsIgnoreCase(("city"))) {
			return "city_tour";
		} else {
			return "country_tour";
		}
	}
}
