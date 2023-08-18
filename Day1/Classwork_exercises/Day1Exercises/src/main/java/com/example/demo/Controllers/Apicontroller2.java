package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Apicontroller2 {
	@Value("${fav}")
	private String yourFavColor;
@GetMapping("disp")
public String getMyFav()
{
	return "My favourite color is "+yourFavColor;
}
}
