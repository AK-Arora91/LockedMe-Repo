package com.lockers.library;

import java.util.Scanner;

public class Main {

	static Scanner in=new Scanner(System.in);
	
	private static void retrieveFileNames() {
		
	}
	
	private static void businessLevelOperation() {
			
	}
	
	public static void main(String arg[]) {
		
		System.out.println("Welcome To LockedMe.com");
		System.out.println("Developer     Ankit Arora");
		System.out.println("Company       TEKsystems Global Services");
		
		int choice;
		
		Task:
		do {
			System.out.println("\n1. Retrieve the file names");
			System.out.println("2. Business-Level Operations");
			System.out.println("3. Exit");
			System.out.print("Enter Operation Number :- ");
			choice=in.nextInt();
			switch(choice) {
			
				case 1: retrieveFileNames();
						break;
				case 2: businessLevelOperation();
						break;
				case 3: break Task;
				
				default: System.out.println("Enter Correct Option"); 
			}
			
		}while(true);
		
		in.close();
	}
}
