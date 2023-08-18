package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Apicontroller1 {
	@Value("${ata}")
	private String studentName;
@GetMapping("pri")
public String getName()
{
	return "Welcome "+studentName+"!";
}
}
