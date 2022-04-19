package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Contractor;
import com.example.demo.service.ContractorService;

@RestController
public class ContractorController {
	@Autowired
	ContractorService contractorService;

	// Test greetings
	@RequestMapping(value = "/contractor", method = RequestMethod.GET)
	public String Greeting() {
		return "Hello This is Contractor Controller EndPoint";
	}

	// Add Contractor
	@RequestMapping(value = "/contractor1", method = RequestMethod.POST)
	public Contractor Save(@RequestBody Contractor contractor) {
		return contractorService.Save(contractor);
	}

	// GetAll Contractor
	@RequestMapping(value = "/contractor1", method = RequestMethod.GET)
	public List<Contractor> getAll() {
		return contractorService.getAll();
	}
}
