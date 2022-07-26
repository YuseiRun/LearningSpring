package com.puralsight.fundementals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FundementalsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FundementalsApplication.class, args);
	}

	@GetMapping
	public String hello(){
		return "hello world";
	}
	
	@GetMapping("/api/foos")
	@ResponseBody
	public String getFoos(@RequestParam String id) {
    	return "ID: " + id;
	}


}
