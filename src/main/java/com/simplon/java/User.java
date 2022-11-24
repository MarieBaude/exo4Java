package com.simplon.java;

public class User {
	private String lastName;
	private String firstName;
	private int birthday;
	private String mail;
	private String login;
	private String password;
	
	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}



	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}



	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	User(String lastName, String firstName, int birthday, String mail, String login, String password) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.birthday = birthday;
		this.mail = mail;
		this.login = login;
		this.password = password;
	}
}
