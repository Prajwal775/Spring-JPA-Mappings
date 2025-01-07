package com.mappings_demo.service;

import com.mappings_demo.entity.Address;
import com.mappings_demo.entity.Student;
import com.mappings_demo.repository.AddressRepository;
import com.mappings_demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AppService {

    @Autowired
    public StudentRepository studentRepository;

    @Autowired
    public AddressRepository addressRepository;


@Transactional
    public void saveData(){
        Student piyush=new Student("Piyush",863032044);
        Address piyushAddress=new Address("bell road","dehradun","uttarakhand");


        studentRepository.save(piyush);
        addressRepository.save(piyushAddress);
    }
}
