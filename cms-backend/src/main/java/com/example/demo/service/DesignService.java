package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Design;
import com.example.demo.repository.DesignRepository;

@Service
public class DesignService implements DesignServiceImpl {
@Autowired DesignRepository designRepository;

	@Override
	public Design Add(Design design) {
		return designRepository.save(design);
	}

	@Override
	public List<Design> getAll() {
		return	designRepository.findAll();
	}
	

}
