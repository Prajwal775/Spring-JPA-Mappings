package com.mappings_demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int addressId;
    private String houseDetails;
    private String city;
    private String state;


    public Address() {
    }

    public Address(String houseDetails, String city, String state) {
        this.houseDetails = houseDetails;
        this.city = city;
        this.state = state;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getHouseDetails() {
        return houseDetails;
    }

    public void setHouseDetails(String houseDetails) {
        this.houseDetails = houseDetails;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", houseDetails='" + houseDetails + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
