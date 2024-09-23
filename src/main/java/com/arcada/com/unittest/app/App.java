package com.arcada.com.unittest.app;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
    	App app = new App();
    	
    	Scanner input = new Scanner(System.in);
    	
    	
    	System.out.println("Write name:");
    	
    	String name = input.nextLine();
    	
    	if (name.equalsIgnoreCase("Hermes")) {
    		System.out.println("Showing all friends");
        	System.out.println("-------------------");
        	String friends[] = app.fetch(name);
        	for(int i = 0; i < friends.length; i++) {
        		System.out.println( i+1 + ". " + friends[i]);
        	}
    	}
    	
    	input.close();
        
    }
    
    public String[] fetch(String name) {
    	
    	if (name.equalsIgnoreCase("hermes")) {
    		return new String[] {"Olivia Miller", "Ethan Johnson", "Ava Roberts", "Liam Walker", "Sophia Thompson", "Jackson Davis", "Mia White", "James Anderson", "Amelia Lewis", "Lucas Moore", "Isabella Harris", "Benjamin Clark", "Emily Young", "Alexander Hall", "Charlotte Allen", "Henry Wright", "Abigail Scott", "Daniel King","Harper Green", "William Baker"};
    	} else if (name.equalsIgnoreCase("performancefail")) {
    		try {
    			Thread.sleep(500);
    		} catch(InterruptedException e) {
    			e.printStackTrace();
    		}
    	} 
    	// Return null if the inserted name is wrong
    	return null;
    }
}
