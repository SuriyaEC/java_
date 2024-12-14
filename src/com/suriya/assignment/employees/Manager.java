package com.suriya.assignment.employees;

public class Manager extends Employee{
	private String department;
	private int experience;

	public Manager(String name,int employeeid,long salary,String department,int experience) {
		super(name,employeeid,salary);
		this.department=department;
		this.experience=experience;
	}
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
}