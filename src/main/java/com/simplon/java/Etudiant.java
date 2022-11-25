package com.simplon.java;

public class Etudiant {
	private String name;
	private double note1;
	private double note2;
	private double note3;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the note1
	 */
	public double getNote1() {
		return note1;
	}

	/**
	 * @param note1 the note1 to set
	 */
	public void setNote1(double note1) {
		this.note1 = note1;
	}

	/**
	 * @return the note2
	 */
	public double getNote2() {
		return note2;
	}

	/**
	 * @param note2 the note2 to set
	 */
	public void setNote2(double note2) {
		this.note2 = note2;
	}

	/**
	 * @return the note3
	 */
	public double getNote3() {
		return note3;
	}

	/**
	 * @param note3 the note3 to set
	 */
	public void setNote3(double note3) {
		this.note3 = note3;
	}

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
