package com.pharmacy.application.pharmacy.control;

import com.pharmacy.application.pharmacy.model.Brand;

import com.pharmacy.application.pharmacy.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BrandController {
    @Autowired
    private BrandService brandService;
    @RequestMapping(method = RequestMethod.POST,value = "/addBrand")
    public void addBrand(@RequestBody Brand brands){
        brandService.addBrand(brands);
    }
    @RequestMapping("/getAllBrand")
    public List<Brand> getAllBrand(){
        return brandService.getAllBrand();
    }
    @RequestMapping(method = RequestMethod.PUT,value = "/updateBrand/{id}")
    public void updateBrand(@PathVariable Integer id, @RequestBody Brand brands){
        brandService.updateBrand(id,brands);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/deleteBrand/{id}")
    public void deleteBrand(@PathVariable Integer id){
        brandService.deleteBrand(id);;
    }
}
