package com.example.demo;

import java.util.ArrayList;

public class Lists {
	ArrayList<String> names = new ArrayList<>();
	ArrayList<Integer> years = new ArrayList<>();
	ArrayList<Integer> months = new ArrayList<>();
	ArrayList<Integer> days = new ArrayList<>();
	
	public Lists(ArrayList<String> names, ArrayList<Integer> years, ArrayList<Integer> months, ArrayList<Integer> days) {
		this.names = names;
		this.years = years;
		this.months = months;
		this.days = days;
	}
	
	public ArrayList<String> getName() {
		return names;
	}
	
	public ArrayList<Integer> getYear() {
		return years;
	}
	
	public ArrayList<Integer> getMonth() {
		return months;
	}
	
	public ArrayList<Integer> getDay() {
		return days;
	}
}
