package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService implements EmployeeServiceImpl{
	@Autowired EmployeeRepository  employeeRepository;
	
	
	@Override
	public Employee Save(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> GetAll() {
		return employeeRepository.findAll();
	}

}
