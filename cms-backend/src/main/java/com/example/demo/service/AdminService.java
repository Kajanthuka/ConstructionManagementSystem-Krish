package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Admin;
import com.example.demo.repository.AdminRepository;

@Service
public class AdminService implements AdminServiceImpl {
	
	@Autowired AdminRepository adminRepository;

//	@Override
//	public Admin Save(Admin admin) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
	@Override
	public List<Admin> getadmin() {
		return adminRepository.findAll();
	
	}

	@Override
	public Optional<Admin> findById(int id) {
		return adminRepository.findById(id);
	}

//	@Override
//	public Admin getByfirstname(String firstname) {
//		return adminRepository.getByfirstname(firstname);
//		
//	}

//	//rough method
//	@Override
//	public Admin getByfirstnameAndPassword(String firstname, String password) {
//		return	adminRepository.getByfirstnameAndPassword(firstname, password);
//		 
//	}

	@Override
	public List<Admin> addAdmin(String firstname) {
		return	adminRepository.findAdminByfirstname(firstname);
		 
	}

}
