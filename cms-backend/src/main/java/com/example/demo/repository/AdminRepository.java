package com.example.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

	//rough method
	public Admin getByfirstnameAndPassword(String firstname,String password);
	public List <Admin> findAdminByfirstname(String firstname);
}
