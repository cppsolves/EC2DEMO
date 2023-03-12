package com.example.SampleDatabasePractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
@ComponentScan(basePackages = {"com.example.SampleDatabasePractice","com.example.SampleDatabasePractice.configuration"})
public class
SampleDatabasePracticeApplication {
	public static void main(String[] args) {
		SpringApplication.run(SampleDatabasePracticeApplication.class, args);
	}
}
