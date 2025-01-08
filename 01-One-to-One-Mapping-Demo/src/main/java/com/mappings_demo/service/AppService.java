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

    Address piyushAddress = new Address("bell road", "dehradun", "uttarakhand");
    //piyush.setAddress(piyushAddress); // to enter address id in fk when creation
    //or you can alter the construvtor of student class and mention this in the constructor only eg.
    // 1st way //    Student piyush=new Student("Piyush",863032044);
    //2nd way
    Student piyush = new Student("Piyush", 863032044, piyushAddress);
    // Remember to save the address first then the student object;

    addressRepository.save(piyushAddress);
    studentRepository.save(piyush);
}

@Transactional
public void fetchData(){
    Student studentdata=studentRepository.findById(1).get();
    System.out.println(studentdata);
    Address addressdata=studentdata.getAddress();
    System.out.println(addressdata.getAddressId());
}
}
