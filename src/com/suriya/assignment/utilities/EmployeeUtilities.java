package com.suriya.assignment.utilities;

import com.suriya.assignment.employees.*;

public class EmployeeUtilities {
	
	public static void printdetails(Employee employee) {
		System.out.println("ID : "+employee.getEmployeeid());
		System.out.println("NAME : "+employee.getName());
		System.out.println("SALARY : "+employee.getSalary());
		
		if(employee instanceof Manager) {
			Manager m1=(Manager) employee;
			System.out.println("Department : "+ m1.getDepartment());
			System.out.println("Experience : "+ m1.getExperience() + " years");
		}
		else {
			Developer d1=(Developer) employee;
			System.out.println("Skills : "+ d1.getSkills());
		}
		System.out.println();
	}
}