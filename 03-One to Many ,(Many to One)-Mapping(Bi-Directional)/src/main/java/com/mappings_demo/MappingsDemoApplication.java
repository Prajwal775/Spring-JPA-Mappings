package com.mappings_demo;

//import com.mappings_demo.service.AppService;
import com.mappings_demo.entity.Address;
import com.mappings_demo.entity.Student;
import com.mappings_demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MappingsDemoApplication implements CommandLineRunner {

	@Autowired
	StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(MappingsDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Student s1=new Student("pranay",5321647);


		Address a1=new Address(12,"lane 21","dehradun","india");

		a1.setStudent(s1);

		Address a2=new Address(21,"lane 24","saharanpur","india");

		a2.setStudent(s1);


		List<Address> addressList=new ArrayList<>();
		addressList.add(a1);
		addressList.add(a2);

		s1.setAddressList(addressList);

		Student savedStudentS1 = studentRepository.save(s1);


		System.out.println(savedStudentS1);


	}
}
