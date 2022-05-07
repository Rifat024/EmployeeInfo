package com.example.JPA.joining.Service;

import com.example.JPA.joining.Reporsitory.EmployeeRepository;
import com.example.JPA.joining.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    public final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> addEmployees(List<Employee> employee){
        return employeeRepository.saveAll(employee);
    }
}
