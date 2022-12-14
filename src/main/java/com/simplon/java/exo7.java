package com.simplon.java;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
		User u2 = new User("Marie", "Baude", 2002, "mail", "login2", "pw2");
		User u3 = new User("Marie", "Baude", 2002, "mail", "login3", "pw3");
		User u4 = new User("Marie", "Baude", 2002, "mail", "login4", "pw4");

		List usersList = new ArrayList();
		usersList.add(u1);
		usersList.add(u2);
		usersList.add(u3);
		usersList.add(u4);
		
		FileWriter file = null;
		
		final String DELIMITER = ",";
		final String SEPARATOR = "\n";
		
		try {
			file = new FileWriter("User.csv");
        
	        Iterator it = usersList.iterator();
	        while(it.hasNext()) {
	          User b = (User)it.next();
	          file.append(b.getLogin());
	          file.append(DELIMITER);
	          file.append(b.getPassword());
	          
	          file.append(SEPARATOR);
	        }
      
	        file.close();
		} catch(Exception e) {
			e.printStackTrace();
	    }
		
		
		connect(u1);
	}
}
