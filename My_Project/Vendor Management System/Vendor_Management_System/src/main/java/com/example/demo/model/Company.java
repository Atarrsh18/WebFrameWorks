package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="company")
public class Company {
@Id 
private int companyid;
private String companyname;
private String description;
public Company() {
	super();
	// TODO Auto-generated constructor stub
}
public Company(int companyid, String companyname, String description) {
	super();
	this.companyid = companyid;
	this.companyname = companyname;
	this.description = description;
}
public int getCompanyid() {
	return companyid;
}
public void setCompanyid(int companyid) {
	this.companyid = companyid;
}
public String getCompanyname() {
	return companyname;
}
public void setCompanyname(String companyname) {
	this.companyname = companyname;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

}
