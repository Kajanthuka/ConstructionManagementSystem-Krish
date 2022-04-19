package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Project;
import com.example.demo.service.ProjectService;

@RestController
public class ProjectControlller {
	@Autowired ProjectService projectService;
	
	@RequestMapping(value="/project1" , method = RequestMethod.GET)
	public String Greetings() {
		return "This is Project EndPoint" ;
	}
	
	@RequestMapping(value = "/project" , method = RequestMethod.POST)
	public Project Save (@RequestBody Project project) {
		return  projectService.save(project);
	}
	
	@RequestMapping(value = "/project" ,method = RequestMethod.GET)
	public List<Project> getAll(){
		return projectService.getAll();
	}

}
