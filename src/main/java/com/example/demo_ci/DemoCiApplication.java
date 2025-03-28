package com.example.demo_ci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoCiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoCiApplication.class, args);
	}

}


@RestController
class HelloController {

	@GetMapping("/")
	public String hello() {
		return "Alegria, CI!";
	}
}