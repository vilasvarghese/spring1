package com.vilas.ch3.annotation.aconfig;

public class Employee {

	private String empId = "1";

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	
	public void display() {
		System.out.println("Emp "+empId);
	}
}
