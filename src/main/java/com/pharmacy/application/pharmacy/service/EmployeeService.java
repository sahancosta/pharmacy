package com.pharmacy.application.pharmacy.service;

import com.pharmacy.application.pharmacy.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    void addEmployee(Employee employee);

    List<Employee> getAllEmployee();

    public Optional<Employee> updateEmployee(Integer id, Employee employee);

    void deleteEmployee(Integer id);

    Object getById(Integer id);
}
