package com.pharmacy.application.pharmacy.web;

import com.pharmacy.application.pharmacy.model.Employee;
import com.pharmacy.application.pharmacy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class EmployeeWebController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public  String showIndex(){
        return "index";
    }

    @GetMapping("/viewEmployees")
    public String getAllEmployees(Model model) {
        model.addAttribute("temps",employeeService.getAllEmployee());
        return "viewEmployees";
    }

    @GetMapping("/showaddEmployees")
    public String showaddEmployeesForm(Employee employee){
        return "addemployees";
    }

    @PostMapping("/addnewEmployee")
    public String addnewEmployee(Employee employee,BindingResult result){
        if (result.hasErrors()){
            return "addemployees";
        }
        employeeService.addEmployee(employee);
        return "redirect:/viewEmployees";
    }

    @GetMapping("/showeditEmployeesForm/{id}")
    public String showeditEmployeesForm(@PathVariable("id") Integer id,Model model){
        model.addAttribute("temps", employeeService.getById(id));
        return "editemployees";
    }

    @PostMapping("/updateEmployee/{id}")
    public String updateemployee(@PathVariable("id") Integer id, Employee employee, BindingResult result, Model model){
        if (result.hasErrors()){
            employee.setEmp_id(id);
            model.addAttribute("temps", employee);
            return"editemployees";
        }
        Optional<Employee> employee1 =employeeService.updateEmployee(id, employee);
        return "redirect:/viewEmployees";

    }

    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable ("id")Integer id,Model model){
        employeeService.deleteEmployee(id);
        return "redirect:/viewEmployees";
    }



}
