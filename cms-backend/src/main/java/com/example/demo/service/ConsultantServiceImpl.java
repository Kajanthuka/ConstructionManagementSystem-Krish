package com.example.demo.service;
import java.util.List;
import com.example.demo.model.Consultant;

public interface ConsultantServiceImpl {
	public Consultant Save(Consultant conslutant);
	public List<Consultant> getAll();
	

}
