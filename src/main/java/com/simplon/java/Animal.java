package com.simplon.java;

public class Animal {
	private String name;
	
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
	
	public void cri() {
		System.out.println("Je cri");
	}
}
