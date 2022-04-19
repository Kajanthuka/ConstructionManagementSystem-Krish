package com.example.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	
	@Id
	@Column(name="emp_id")
	@GeneratedValue
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String password ;
	private String phone_number;
	private String address ;
	private String current_Project;
	
	@ManyToOne
	@JoinColumn(name="contractor_id" )
	private Contractor contractor;
	
	
	public Contractor getContractor() {
		return contractor;
	}
	public void setContractor(Contractor contractor) {
		this.contractor = contractor;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCurrent_Project() {
		return current_Project;
	}
	public void setCurrent_Project(String current_Project) {
		this.current_Project = current_Project;
	}
	
	
	
	
	
	
	
	
	
	

}
