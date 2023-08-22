package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Employee")
public class EmployeeEntity {
	@Id
private int id;
private int age;
private String employeeName;
private long salary;
public EmployeeEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public EmployeeEntity(int id, int age, String employeeName, long salary) {
	super();
	this.id = id;
	this.age = age;
	this.employeeName = employeeName;
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public long getSalary() {
	return salary;
}
public void setSalary(long salary) {
	this.salary = salary;
}


}
