package com.simplon.java;

import java.util.Scanner;

public class exo7 {
	public static void connect(User user) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Saisir votre login : ");
	    String login = sc.nextLine();
	    
	    Scanner sc2 = new Scanner(System.in);
	    System.out.print("Saisir votre mot de passe : ");
	    String pw = sc2.nextLine();
	    
	    if (user.getLogin().equals(login) && user.getPassword().equals(pw)) {
	    	System.out.println("Vous êtes connecté.");
	    	
	    } else {
	    	System.out.println("Vous n'êtes pas connecté.");
	    }
	}

	public static void main(String[] args) {
		User u1 = new User("Marie", "Baude", 2002, "mail", "login", "pw");
		connect(u1);
	}


}
