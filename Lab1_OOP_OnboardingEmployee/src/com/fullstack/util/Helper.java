package com.fullstack.util;

import java.util.Map;
import java.util.HashMap;
import java.util.Random;

public class Helper {

	String[] depArray = new String[5];
	Map<Integer,String> deptMap = new HashMap<Integer,String>();


	public void initialize() {

		//Option1: Using a String Array
		depArray[0] = "tech";
		depArray[1] = "admin";
		depArray[2] = "hr";
		depArray[3] = "legal";	

		//Option2: Using Map
		deptMap.put(1, "tech");
		deptMap.put(2, "admin");
		deptMap.put(1, "hr");
		deptMap.put(1, "legal");

		//Option3: Switch Statement
		//		String deptName = null;
		//		switch(choice){ 
		//		case 1: deptName = "tech"; 
		//		break;
		//		case 2: deptName = "admin"; 
		//		break; 
		//		case 3: deptName = "hr"; 
		//		break; 
		//		case 4: deptName = "legal"; break; }

	}

	public void displayMenu() {
		System.out.println("Please enter the department from the following:");
		System.out.println("1. Technical");
		System.out.println("2. Administration");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
	}


	public String getDepatmentType(int choice) {

		//Option1: Using a String Array
		return depArray[choice-1];	

		//Option2: Using Map
		//		String deptName = null;
		//		for (Map.Entry<Integer,String> dept :	deptMap.entrySet()) {
		//			if(dept.getKey() == choice)
		//				deptName =  dept.getValue();
		//		}
		//		return deptName;
	}


	public char[] generatePassword(int len) {

		String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Small_chars = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols = "!@#$%^&*_=+-/.?<>)";


		String values = Capital_chars + Small_chars + numbers + symbols;

		// Using random method
		Random random = new Random();

		char[] password = new char[len];

		for (int i = 0; i < len; i++)
		{
			// Use of charAt() method : to get character value
			// Use of nextInt() as it is scanning the value as int
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		return password;
	}
}
