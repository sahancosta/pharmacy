package com.pharmacy.application.pharmacy.repository;

import com.pharmacy.application.pharmacy.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
