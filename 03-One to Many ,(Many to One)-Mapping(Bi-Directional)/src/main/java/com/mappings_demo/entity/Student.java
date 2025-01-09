package com.mappings_demo.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "StudentId")
    private int StudentId;
    @Column(name = "StudentName")
    private String name;
    @Column(name="PhoneNumber")
    private int mobileNo;





    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<Address> addressList=new ArrayList<>();

    public Student() {
    }

    public Student(String name, int mobileNo) {
        this.name = name;
        this.mobileNo = mobileNo;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", name='" + name + '\'' +
                ", mobileNo=" + mobileNo +
                '}';
    }
}
