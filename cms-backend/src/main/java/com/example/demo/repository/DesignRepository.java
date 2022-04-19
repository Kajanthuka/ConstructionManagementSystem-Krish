package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Design;

public interface DesignRepository extends JpaRepository<Design, Integer> {
 
}
