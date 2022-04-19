package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Consultant;

public interface ConsultantRepository extends JpaRepository<Consultant, Integer>{

}
