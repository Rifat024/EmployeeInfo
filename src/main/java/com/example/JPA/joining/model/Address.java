package com.example.JPA.joining.model;

import javax.persistence.*;
import javax.transaction.Transactional;
import javax.validation.constraints.NotBlank;

@Entity
@Transactional
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long addressId;
    @NotBlank
    @Column(name = "city",nullable = false,columnDefinition = "TEXT")
    private String city;
    @NotBlank
    @Column(name = "address_Type",nullable = false,columnDefinition = "TEXT")
    private String addressType;

    public Address(Long addressId, String city, String addressType) {
        this.addressId = addressId;
        this.city = city;
        this.addressType = addressType;
    }

    public Address() {

    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }
}
