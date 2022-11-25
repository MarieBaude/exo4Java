package com.simplon.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exo8 {
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
		/*User u1 = new User("Marie", "Baude", 2002, "mail", "login", "pw");
		User u2 = new User("Marie", "Baude", 2002, "mail", "login2", "pw2");
		User u3 = new User("Marie", "Baude", 2002, "mail", "login3", "pw3");
		User u4 = new User("Marie", "Baude", 2002, "mail", "login4", "pw4");

		List usersList = new ArrayList();
		usersList.add(u1);
		usersList.add(u2);
		usersList.add(u3);
		usersList.add(u4);
		
		connect(u1);*/
		
		Scanner sc3 = new Scanner(new File("Users/mariebaude/Documents/Simplon Java/exo4/User.csv"));  
		sc3.useDelimiter(",");    
		
		while (sc3.hasNext())  {  
			System.out.print(sc3.next());    
		}   
		
		sc3.close();    

	}

}
