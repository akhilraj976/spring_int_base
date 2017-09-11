package com.si.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("integration-context.xml")
public class SpringStarterApplication {
	
	public static void main(String[] args) {
		 SpringApplication.run(SpringStarterApplication.class, args);
	}

}
