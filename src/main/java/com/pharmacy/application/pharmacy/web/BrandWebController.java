package com.pharmacy.application.pharmacy.web;

import com.pharmacy.application.pharmacy.model.Brand;
import com.pharmacy.application.pharmacy.model.Employee;
import com.pharmacy.application.pharmacy.service.BrandService;
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
public class BrandWebController {
    @Autowired
    private BrandService brandService;


    @GetMapping("/viewBrand")
    public String getAllBrand(Model model) {
        model.addAttribute("brns",brandService.getAllBrand());
        return "viewbrand";
    }

    @GetMapping("/showaddBrand")
    public String showaddBrandForm(Brand brand){
        return "addbrand";
    }

    @PostMapping("/addnewBrand")
    public String addnewBrand(Brand brand, BindingResult result){
        if (result.hasErrors()){
            return "addbrand";
        }
        brandService.addBrand(brand);
        return "redirect:/viewBrand";
    }

    @GetMapping("/showeditBrandForm/{id}")
    public String showeditBrandForm(@PathVariable("id") Integer id, Model model){
        model.addAttribute("brns", brandService.getById(id));
        return "editbrand";
    }

    @PostMapping("/updateBrand/{id}")
    public String updatebrand(@PathVariable("id") Integer id, Brand brand, BindingResult result, Model model){
        if (result.hasErrors()){
            brand.setBrand_id(id);
            model.addAttribute("brns", brand);
            return"editbrand";
        }
        Optional<Brand> brand1 =brandService.updateBrand(id, brand);
        return "redirect:/viewBrand";

    }

    @GetMapping("/deleteBrand/{id}")
    public String deleteEmployee(@PathVariable ("id")Integer id,Model model){
        brandService.deleteBrand(id);
        return "redirect:/viewBrand";
    }
}
