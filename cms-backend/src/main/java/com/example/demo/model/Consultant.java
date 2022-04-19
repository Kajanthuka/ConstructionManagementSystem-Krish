package com.example.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="consultant")
public class Consultant {
	
	@Id
	@Column(name="consultant_id")
	@GeneratedValue
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private String phone_number;
	private String no_of_Projects;
	
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
	public String getNo_of_Projects() {
		return no_of_Projects;
	}
	public void setNo_of_Projects(String no_of_Projects) {
		this.no_of_Projects = no_of_Projects;
	}
	
	
	

}
