package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Admin;
import com.example.demo.service.AdminService;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class AdminController {
	@Autowired
	AdminService adminService;

	//greeting checkup
	@RequestMapping(value = "/admin1geerting", method = RequestMethod.GET)
	public String greeting() {
		return "Hi This is Admin Endpoint Controller  Welcome...Admin Table APIs are progress";
	}

	//GetAllAdmin
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public List<Admin> getAll() {
		return adminService.getadmin();
	}

	//GetAdminById
	@RequestMapping(value = "/adminbyId", method = RequestMethod.GET)
	public Optional<Admin> findById(int id) {
		return adminService.findById(id);
	}
	
//	//rough Method
//	@RequestMapping(value="/adminlog1" , method = RequestMethod.GET)
//	public Admin getByUsername(@RequestParam String firstname, @RequestParam String password){
//		return adminService.getByfirstnameAndPassword(firstname, password);
//	}

	
	@RequestMapping(value = "adminlog", method = RequestMethod.GET)
	public ResponseEntity<Admin> addAdmin(@RequestParam String firstname, @RequestParam String password) {
		List<Admin> adminList = adminService.addAdmin(firstname);
		Admin findAdmin = new Admin();
		for (Admin admin : adminList) {
			if (admin.getFirstname().equals(firstname) && admin.getPassword().equals(password)) {
				findAdmin = admin;
				return ResponseEntity.ok().body(findAdmin);
			} else {
				return ResponseEntity.notFound().build();
			}
		}
		return null;
	}
	

}
