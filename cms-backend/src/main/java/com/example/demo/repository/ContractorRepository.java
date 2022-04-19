package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Contractor;

public interface ContractorRepository extends JpaRepository<Contractor, Integer> {

}
