package com.example.JPA.joining.Controller;

import com.example.JPA.joining.Service.EmployeeService;
import com.example.JPA.joining.model.Employee;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/employee")
@RestController
public class EmployeeController {
    public final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public List<Employee> employeeList(@NotNull @RequestBody List<Employee> employees) {
        return employeeService.addEmployees(employees);
    }

}
