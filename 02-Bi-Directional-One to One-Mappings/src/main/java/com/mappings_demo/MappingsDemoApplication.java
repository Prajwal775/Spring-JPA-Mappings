package com.mappings_demo;

import com.mappings_demo.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MappingsDemoApplication implements CommandLineRunner {

	@Autowired
	AppService appService;

	public static void main(String[] args) {
		SpringApplication.run(MappingsDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//	 appService.saveData();
//		appService.fetchData();
 appService.getStudentDataFromAddress1();
//		System.out.println("data for student and address tables have been inserted");
	}
}
