package com.example.demo.service;
import java.util.List;
import com.example.demo.model.Project;

public interface ProjectServiceImpl {
	public Project save(Project project);
	public List<Project> getAll();

}
