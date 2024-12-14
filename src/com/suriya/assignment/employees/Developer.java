package com.suriya.assignment.employees;

public class Developer extends Employee {
	private String skills;

	public Developer(String name,int employeeid,long salary,String skills) {
		super(name,employeeid,salary);
		this.skills=skills;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}
}
