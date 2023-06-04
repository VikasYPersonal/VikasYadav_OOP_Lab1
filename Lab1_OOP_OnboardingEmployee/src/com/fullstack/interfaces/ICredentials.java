package com.fullstack.interfaces;

import com.fullstack.model.Employee;

public interface ICredentials {
	
	public String generateEmailAddress(Employee emp);
	public String generatePassword();
	public void showCredentials(Employee emp);

}
