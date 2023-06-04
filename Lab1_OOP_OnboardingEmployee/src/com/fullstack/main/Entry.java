package com.fullstack.main;

import java.util.Scanner;
import com.fullstack.model.Employee;
import com.fullstack.service.CredentialService;
import com.fullstack.util.Helper;

public class Entry {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp;
		
		Scanner input = new Scanner(System.in);
		String firstName,lastName;
		int deptChoice;
		
		
		System.out.println("Enter Employee First Name:");
		firstName = input.nextLine();
		
		System.out.println("Enter Employee Last Name:");
		lastName = input.nextLine();
		
		emp  = new Employee(firstName,lastName);
		System.out.println("Employee created successfully!");
		
		Helper util = new Helper();
		util.initialize();
		util.displayMenu();
		deptChoice = input.nextInt();
		emp.setDepartment(util.getDepatmentType(deptChoice));
				
		CredentialService credService = new CredentialService();
		credService.showCredentials(emp);
		
	}

}
