package com.fullstack.service;

import com.fullstack.interfaces.ICredentials;
import com.fullstack.model.Employee;
import com.fullstack.util.Helper;

public class CredentialService implements ICredentials {

	@Override
	public String generateEmailAddress(Employee emp) {
		// TODO Auto-generated method stub
		return emp.getFirstName()+emp.getLastName()+"@"+emp.getDepartment()+".abc.com";
	}

	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		Helper util =  new Helper();
		return util.generatePassword(10).toString();
	}

	@Override
	public void showCredentials(Employee emp) {
		// TODO Auto-generated method stub		
		System.out.println("Dear "+ emp.getFirstName() +" your generated credentials are as follows");
		System.out.println("Email ---> " + generateEmailAddress(emp));	
		System.out.println("Password ---> " + generatePassword());
	}
}
