package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Design;
import com.example.demo.service.DesignService;

@RestController
public class DesignController {
	@Autowired DesignService designService;

	@RequestMapping(value="/design1" ,  method = RequestMethod.GET)
	public String Greeting() {
		return "Hi This is Design EndPpoint";
	}
	
	@RequestMapping(value="/design", method = RequestMethod.POST)
	public Design save(@RequestBody Design design) {
		return designService.Add(design);
	}
	
	@RequestMapping(value = "/design" , method = RequestMethod.GET)
	public List<Design> getAll(){
		return designService.getAll();	
	}
	
}

