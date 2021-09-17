package com.pharmacy.application.pharmacy.web;


import com.pharmacy.application.pharmacy.model.Drugs;
import com.pharmacy.application.pharmacy.model.Employee;
import com.pharmacy.application.pharmacy.service.DrugsService;
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
public class DrugsWebController {
    @Autowired
    private DrugsService drugsService;


    @GetMapping("/viewDrugs")
    public String getAllDrugs(Model model) {
        model.addAttribute("drs",drugsService.getAllDrugs());
        return "viewdrugs";
    }

    @GetMapping("/showaddDrugs")
    public String showaddDrugsForm(Drugs drugs){
        return "adddrugs";
    }

    @PostMapping("/addnewDrugs")
    public String addnewDrugs(Drugs drugs, BindingResult result){
        if (result.hasErrors()){
            return "adddrugs";
        }
        drugsService.addDrugs(drugs);
        return "redirect:/viewDrugs";
    }

    @GetMapping("/showeditDrugsForm/{id}")
    public String showeditDrugsForm(@PathVariable("id") Integer id, Model model){
        model.addAttribute("drs", drugsService.getById(id));
        return "editdrugs";
    }

    @PostMapping("/updateDrugs/{id}")
    public String updatedrugs(@PathVariable("id") Integer id, Drugs drugs, BindingResult result, Model model){
        if (result.hasErrors()){
            drugs.setDrug_id(id);
            model.addAttribute("drs", drugs);
            return"editdrugs";
        }
        Optional<Drugs> drugs1 =drugsService.updateDrugs(id, drugs);
        return "redirect:/viewDrugs";

    }

    @GetMapping("/deleteDrugs/{id}")
    public String deleteDrugs(@PathVariable ("id")Integer id,Model model){
        drugsService.deleteDrugs(id);
        return "redirect:/viewDrugs";
    }
}
