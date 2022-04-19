package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired EmployeeService employeeService;
	
	@RequestMapping(value = "/employee1" , method = RequestMethod.GET)
	public String Greeting() {
		return "Hi This is Employee EndPointURL Welcome Guys";
	}
	
	@RequestMapping(value = "/employee" ,method = RequestMethod.POST)
	public Employee save(@RequestBody Employee employee) {
		return employeeService.Save(employee);
	}

	@RequestMapping(value = "/employee" , method = RequestMethod.GET)
	public List<Employee> getAll(){
		return employeeService.GetAll();	
	}
	
}

