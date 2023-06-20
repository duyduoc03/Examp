package com.example.examp;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long>  {
    List<Employee> findByNameContainingIgnoreCase(String name);
}