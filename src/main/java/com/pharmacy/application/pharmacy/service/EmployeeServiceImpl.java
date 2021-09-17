package com.pharmacy.application.pharmacy.service;

import com.pharmacy.application.pharmacy.model.Employee;
import com.pharmacy.application.pharmacy.model.Payments;
import com.pharmacy.application.pharmacy.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public  void addEmployee(Employee employee){employeeRepository.save(employee);}

    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        employeeRepository.findAll().forEach(employeeList::add);
        return employeeList;

    }

    @Override
    @Transactional
    public Optional<Employee> updateEmployee(Integer id, Employee employee) {
        //employee.setEmp_id(id);
        //employeeRepository.save(employee);
        return employeeRepository.findById(id).map(e->{
            e.setEmp_name(employee.getEmp_name());
            e.setEmp_address(employee.getEmp_address());
            e.setEmp_gender(employee.getEmp_gender());
            e.setEmp_email(employee.getEmp_email());
            return e;

        });
    }

    @Override
    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);

    }

    @Override
    public Object getById(Integer id) {
        Optional<Employee> emp = Optional.ofNullable(employeeRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid Id")));
        Employee employee = emp.get();
        return employee;
    }
}
