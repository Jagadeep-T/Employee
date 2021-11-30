package com.springboot.cruddemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	// define fields
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="department_name")
	private String departmentName;
	
	@Column(name="department_code")
	private int departmentCode;

	
	
	
		
	// define constructors
	
	public Employee() {
		
	}




	public Employee(int id, String departmentName, int departmentCode) {
		
	
		this.departmentName = departmentName;
		this.departmentCode = departmentCode;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getDepartmentName() {
		return departmentName;
	}




	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}




	public int getDepartmentCode() {
		return departmentCode;
	}




	public void setDepartmentCode(int departmentCode) {
		this.departmentCode = departmentCode;
	}




	@Override
	public String toString() {
		return "Employee [id=" + id + ", departmentName=" + departmentName + ", departmentCode=" + departmentCode + "]";
	}

	}