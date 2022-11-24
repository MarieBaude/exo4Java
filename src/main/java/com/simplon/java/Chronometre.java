package com.simplon.java;

import java.util.Calendar;

public class Chronometre {
	private int time;
	
	Chronometre() {
		
	}
	
	public void advanceTime(int i) {
		this.time += i;
	}
	
	public void backTime(int i) {
		this.time -= i;
	}
	
	public void date() {
		Calendar c1 = Calendar.getInstance();
        System.out.println(c1.getTime());
	}		
}
