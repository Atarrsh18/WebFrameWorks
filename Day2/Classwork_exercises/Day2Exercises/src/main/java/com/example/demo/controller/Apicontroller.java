package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Apicontroller {
	@Value("${val}")
	private String name;
@GetMapping("fun")
public String disp()
{
	return "Hello "+name;
}
}
