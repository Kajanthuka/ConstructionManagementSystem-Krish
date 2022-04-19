package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Consultant;
import com.example.demo.repository.ConsultantRepository;

@Service
public class ConsultantService implements ConsultantServiceImpl {
@Autowired
ConsultantRepository consultantRepository;

	@Override
	public Consultant Save(Consultant conslutant) {
		return consultantRepository.save(conslutant);
		
	}

	@Override
	public List<Consultant> getAll() {
		return consultantRepository.findAll();
	}

}
