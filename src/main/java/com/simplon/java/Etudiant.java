package com.simplon.java;

public class Etudiant {
	private String name;
	private double note1;
	private double note2;
	private double note3;
	
	Etudiant(String name, double note1, double note2, double note3) {
		this.name = name;
		this.note1 = note1;
		this.note2 = note2;
		this.note3 = note3;
	}
	
	public double moyenne() {
		double result = (note1 + note2 + note3) / 3;
		return result;
	}
}
