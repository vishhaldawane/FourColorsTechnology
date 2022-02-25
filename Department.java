package com.java;

public class Department { //1. POJO
	
	private int departmentNumber;
	private String departmentName;
	private String departmentLocation;
	
	
	public Department() {
		super();
		System.out.println("Department() no-arg ctor...");
	}
	public Department(int departmentNumber, String departmentName, String departmentLocation) {
		super();
		System.out.println("Department(int,String,String) arg ctor...");
		this.departmentNumber = departmentNumber;
		this.departmentName = departmentName;
		this.departmentLocation = departmentLocation;
	}
	public int getDepartmentNumber() {
		return departmentNumber;
	}
	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentLocation() {
		return departmentLocation;
	}
	public void setDepartmentLocation(String departmentLocation) {
		this.departmentLocation = departmentLocation;
	}
	
	
	
}