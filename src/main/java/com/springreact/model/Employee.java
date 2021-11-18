package com.springreact.model;

public class Employee {
	private long eid;
	private String name;
	private String role;
	
	public long getEid() {
		return eid;
	}
	
	public void setId(long eid) {
		this.eid = eid;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		
	}
	
	public String getRole( ) {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
}
