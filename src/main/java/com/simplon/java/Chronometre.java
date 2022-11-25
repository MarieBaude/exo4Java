package com.simplon.java;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
	
	public String date() {
		Calendar c1 = Calendar.getInstance();
		String date = new SimpleDateFormat("dd/mm/yyyy").format(new Date(this.time * 1000));
		return date;
	}		
}
