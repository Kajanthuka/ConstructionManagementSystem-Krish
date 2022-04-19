package com.example.demo.service;

import java.util.List;
import com.example.demo.model.Contractor;

public interface ContractorServiceImpl {
	public Contractor Save(Contractor contractor);

	public List<Contractor> getAll();

}
