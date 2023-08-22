package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.EmployeeEntity;
@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer>{

}
