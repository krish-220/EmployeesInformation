package com.example.EmployeeDetails.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employees_table")
public class Employees {
	@Id
	private int id;
	private String name;
	private String role;
	private String place;
	private int pnumber;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getPnumber() {
		return pnumber;
	}
	public void setPnumber(int pnumber) {
		this.pnumber = pnumber;
	}
	
	public Employees() {
		super();
	}
	
	public Employees(int id, String name, String role, String place, int pnumber) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.place = place;
		this.pnumber = pnumber;
	}
	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", role=" + role + ", place=" + place + ", pnumber=" + pnumber
				+ "]";
	}
	
	

}
