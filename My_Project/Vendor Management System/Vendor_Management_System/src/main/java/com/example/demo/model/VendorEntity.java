package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Vendor")
public class VendorEntity {
	@Id
private int id;
private String firstname;
private String lastname;
private String address;
private String specialisation;
private String organisation;
private long  phonenumber;
private String email;
private String domain;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn
private ProjectDetails pd;
public VendorEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public VendorEntity(int id, String firstname, String lastname, String address, String specialisation,
		String organisation, long phonenumber, String email, String domain, ProjectDetails pd) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.address = address;
	this.specialisation = specialisation;
	this.organisation = organisation;
	this.phonenumber = phonenumber;
	this.email = email;
	this.domain = domain;
	this.pd = pd;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getSpecialisation() {
	return specialisation;
}
public void setSpecialisation(String specialisation) {
	this.specialisation = specialisation;
}
public String getOrganisation() {
	return organisation;
}
public void setOrganisation(String organisation) {
	this.organisation = organisation;
}
public long getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(long phonenumber) {
	this.phonenumber = phonenumber;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getDomain() {
	return domain;
}
public void setDomain(String domain) {
	this.domain = domain;
}
public ProjectDetails getPd() {
	return pd;
}
public void setPd(ProjectDetails pd) {
	this.pd = pd;
}


}
