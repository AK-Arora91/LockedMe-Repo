package com.lockers.library;

import java.util.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner in=new Scanner(System.in);
	
	private static void retrieveFileNames() {
		
		List<String> names=new ArrayList<>();
		File[] files=new File("D:\\").listFiles();
		
		for(File f:files) {
			names.add(f.getName());
		}
		
		names.sort((String s1,String s2) -> 
		{return s1.replaceFirst("[.][^.]+$","").compareTo(s1.replaceFirst("[.][^.]+$",""));});
		
		names.forEach((n) -> System.out.println(n));
	}
	
	private static void businessLevelOperation() {
		
		int operation;
		File f=null;
		String name;
		
		Task:
		do {

			System.out.println("\n1. Add File");
			System.out.println("2. Delete File");
			System.out.println("3. Search");
			System.out.println("4. Quit");
			System.out.print("Enter Operation Number :- ");
			
			operation=in.nextInt();
			switch(operation) {
				
				case 1: try {
					
							System.out.println("Enter File Name :-");
							name=in.next();
							f=new File("d:\\"+name);
							if(f.createNewFile()) 
								System.out.println("File Successfully Created.");
							else
								System.out.println("File Already exists.");
						
						}catch(IOException e) {
							System.out.println("Try creating again after few minutes");
						}
						break;
						
				case 2: System.out.println("Enter File Name :-");
						name=in.next();
						f=new File("D:\\"+name);
						if(f.delete()) 
							System.out.println("File Successfully Deleted.");
						else
							System.out.println("Can not delete the file");
						break;
						
						
				case 3: System.out.println("Enter File Name :-");
						name=in.next();
						List<String> names=new ArrayList<>();
						File[] files=new File("D:\\").listFiles();
						
						for(File f1:files) {
							names.add(f1.getName());
						}
						if(names.contains(name))
							System.out.println("File Exist");
						else 
							System.out.println("File Doesn't Exist");
						
						break;
						
				case 4: break Task;
				default: System.out.println("Enter Correct Option"); 
			}
		}while(true);
		
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
