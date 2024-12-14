package com.suriya.assignment;

import com.suriya.assignment.employees.*;
import com.suriya.assignment.utilities.*;

public class AssignmentDemo {

	public static void main(String[] args) {
		
		Manager m1=new Manager("suriya",49,100000,"security",15);
		
		Developer d1=new Developer("riya",89,100000,"java,fullstack");
		
		System.out.println("Printing Manager Details");
		EmployeeUtilities.printdetails(m1);
		System.out.println();
		System.out.println("Printing Developer Details");
		EmployeeUtilities.printdetails(d1);

	}

}
