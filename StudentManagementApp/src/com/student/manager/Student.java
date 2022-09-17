package com.student.manager;

public class Student {
private int sid;
private String sname;
private String sphone;
 private String scity;
 //p constructor
public Student(int sid, String sname, String sphone, String scity) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.sphone = sphone;
	this.scity = scity;
}
//getter setter
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getSphone() {
	return sphone;
}
public void setSphone() {
	this.sphone = sphone;
}
public String getScity() {
	return scity;
}
public void setScity(String scity) {
	this.scity = scity;
}
//p constructor
public Student(String sname, String sphone, String scity) {
	super();
	this.sname = sname;
	this.sphone = sphone;
	this.scity = scity;
}
// d constructor
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
//toString 
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", sphone=" + sphone + ", scity=" + scity + "]";
}
 
}
