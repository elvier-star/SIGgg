package com.example.demo;

import javax.swing.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SiGggApplication extends SpringBootServletInitializer {

	
	protected SpringApplicationBuilder configuire(SpringApplicationBuilder bulder) {
		return bulder.sources(SiGggApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SiGggApplication.class, args);
	}

}
