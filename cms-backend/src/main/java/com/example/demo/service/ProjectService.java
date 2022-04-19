package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Project;
import com.example.demo.repository.ProjectRepository;

@Service
public class ProjectService implements ProjectServiceImpl {
@Autowired
	ProjectRepository projectRepository;

	@Override
	public Project save(Project project) {
		return projectRepository.save(project);
	}

	@Override
	public List<Project> getAll() {
		return projectRepository.findAll();
	}

}
