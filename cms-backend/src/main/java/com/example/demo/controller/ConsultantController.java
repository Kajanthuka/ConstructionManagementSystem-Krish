package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Consultant;
import com.example.demo.service.ConsultantService;


@RestController
public class ConsultantController {
	@Autowired ConsultantService consultantService;
	
	@RequestMapping(value = "/consultant1" ,method = RequestMethod.GET)
	public String Greeting() {
		return "Hi This is Consultant Endpoint";
	}
	
	
	@RequestMapping(value = "/consultant" ,method = RequestMethod.POST)
	public Consultant save(@RequestBody Consultant consultant) {
		return consultantService.Save(consultant);
		
	}
	
	@RequestMapping(value="/consultant" , method = RequestMethod.GET)
	public List<Consultant> getAll(){
		return consultantService.getAll();
		
	}

}
