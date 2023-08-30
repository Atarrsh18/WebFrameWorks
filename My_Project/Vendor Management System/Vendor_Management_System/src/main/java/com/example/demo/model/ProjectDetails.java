package com.example.demo.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="projectdetails")
public class ProjectDetails {
@Id
private int projectid;
private String projectname;
private Date startdate,enddate;
private long projectbudget;
@OneToMany(cascade=CascadeType.ALL)
@JoinColumn
private List<Company> c;
public ProjectDetails() {
	super();
	// TODO Auto-generated constructor stub
}
public ProjectDetails(int projectid, String projectname, Date startdate, Date enddate, long projectbudget,
		List<Company> c) {
	super();
	this.projectid = projectid;
	this.projectname = projectname;
	this.startdate = startdate;
	this.enddate = enddate;
	this.projectbudget = projectbudget;
	this.c = c;
}
public int getProjectid() {
	return projectid;
}
public void setProjectid(int projectid) {
	this.projectid = projectid;
}
public String getProjectname() {
	return projectname;
}
public void setProjectname(String projectname) {
	this.projectname = projectname;
}
public Date getStartdate() {
	return startdate;
}
public void setStartdate(Date startdate) {
	this.startdate = startdate;
}
public Date getEnddate() {
	return enddate;
}
public void setEnddate(Date enddate) {
	this.enddate = enddate;
}
public long getProjectbudget() {
	return projectbudget;
}
public void setProjectbudget(long projectbudget) {
	this.projectbudget = projectbudget;
}
public List<Company> getC() {
	return c;
}
public void setC(List<Company> c) {
	this.c = c;
}


}
