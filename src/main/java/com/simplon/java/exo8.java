package com.simplon.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exo8 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc3 = new Scanner(new File("User.csv"));  
		sc3.useDelimiter(",");    
		
		while (sc3.hasNext())  {  
			System.out.print(sc3.next());    
		}   
		
		sc3.close();    

	}

}
