package com.example.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="design")
public class Design {
	
	@Id
	@GeneratedValue
	@Column(name="design_id")
	private int id;
	private String design_Details;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesign_Details() {
		return design_Details;
	}
	public void setDesign_Details(String design_Details) {
		this.design_Details = design_Details;
	}
	
	
	
	

}
