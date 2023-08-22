package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EmployeeEntity;
import com.example.demo.services.EmployeeService;
@RestController
public class Employeecontroller {
@Autowired
EmployeeService es; 
@PostMapping("addemp")
public EmployeeEntity add(@RequestBody EmployeeEntity ee)
{
	return es.saveinfo(ee);
}
@GetMapping("showemp")
public List<EmployeeEntity> show()

{
    return es.showinfo();	
}

}
