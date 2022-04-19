package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Contractor;
import com.example.demo.repository.ContractorRepository;

@Service
public class ContractorService implements ContractorServiceImpl {
	@Autowired
	ContractorRepository contractorRepository;

	@Override
	public Contractor Save(Contractor contractor) {
		return contractorRepository.save(contractor);
	}

	@Override
	public List<Contractor> getAll() {
		return contractorRepository.findAll();
	}

}
