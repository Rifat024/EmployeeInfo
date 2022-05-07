package com.example.JPA.joining.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.transaction.Transactional;
import javax.validation.constraints.NotBlank;

@Entity
@Transactional
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Long empId;
    @NotBlank
    @Column(name = "empName",nullable = false,columnDefinition = "TEXT")
    private String empName;
    @NotBlank
    @Column(name = "empAge",nullable = false)
    private Integer empAge;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee(Long empId, String empName, Integer empAge, Address address) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.address = address;

    }
}
