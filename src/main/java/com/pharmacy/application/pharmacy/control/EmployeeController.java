package com.pharmacy.application.pharmacy.control;

import com.pharmacy.application.pharmacy.model.Employee;
import com.pharmacy.application.pharmacy.model.Payments;
import com.pharmacy.application.pharmacy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping(method = RequestMethod.POST,value = "/addEmployees")
    public void addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
    }
    @RequestMapping("/getAllEmployees")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }
    @RequestMapping(method = RequestMethod.PUT,value = "/updateEmployees/{id}")
    public void updateEmployee(@PathVariable Integer id, @RequestBody Employee employee){
        employeeService.updateEmployee(id,employee);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/deleteEmployee/{id}")
    public void deleteEmployee(@PathVariable Integer id){
        employeeService.deleteEmployee(id);
    }
}
