package com.example.demo.service;
import java.util.List;
import java.util.Optional;
import com.example.demo.model.Admin;

public interface AdminServiceImpl {
	
//	public Admin Save(Admin admin);
// public Admin findAdmin(int id);
	public List<Admin>  getadmin();
	public Optional <Admin> findById(int id);
//	//rough method
//	public Admin getByfirstnameAndPassword(String firstname,String password);
	public  List<Admin> addAdmin(String firstname);
	
	

}
