package com.example.JPA.joining.Reporsitory;

import com.example.JPA.joining.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
