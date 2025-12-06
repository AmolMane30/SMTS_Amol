package com.example.demo.service;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entity.Employee;
import java.util.List;

public interface EmployeeService {

    Employee createEmployee(EmployeeDTO employeeDTO);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Long id, EmployeeDTO employeeDTO);

    void deleteEmployee(Long id);
}
