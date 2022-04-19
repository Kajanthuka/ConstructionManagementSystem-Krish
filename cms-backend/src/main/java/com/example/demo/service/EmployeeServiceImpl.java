package com.example.demo.service;
import java.util.List;
import com.example.demo.model.Employee;

public interface EmployeeServiceImpl {
	
	public Employee Save(Employee employee);
	public List<Employee> GetAll();

}
