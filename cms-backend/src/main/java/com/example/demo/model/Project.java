package com.example.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Project {
	
	@Id
	@Column(name="project_id")
	@GeneratedValue
	private int id;
	private int duration;
	private String phase;
	private String clientDetails;
	private String state;
	
	
	@ManyToOne
	@JoinColumn(name="emp_id" )
	private Employee employee;
	
	
	@ManyToOne
	@JoinColumn(name="design_id" )
	private Design design;
	
	
	
	public Design getDesign() {
		return design;
	}
	public void setDesign(Design design) {
		this.design = design;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getPhase() {
		return phase;
	}
	public void setPhase(String phase) {
		this.phase = phase;
	}
	public String getClientDetails() {
		return clientDetails;
	}
	public void setClientDetails(String clientDetails) {
		this.clientDetails = clientDetails;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	

}
