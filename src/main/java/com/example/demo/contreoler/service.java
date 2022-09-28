package com.example.demo.contreoler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class service {
	
	@GetMapping("/")
	public String iniciarSesion() {
		return "index";
	
	}
}
