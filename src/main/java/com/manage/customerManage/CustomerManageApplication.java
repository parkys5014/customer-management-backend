package com.manage.customerManage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api")
@SpringBootApplication
public class CustomerManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerManageApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return "Spring Boot 연결 성공!";
	}

}
