package com.pharmacy.application.pharmacy.control;

import com.pharmacy.application.pharmacy.model.Drugs;
import com.pharmacy.application.pharmacy.model.Payments;
import com.pharmacy.application.pharmacy.service.DrugsService;
import com.pharmacy.application.pharmacy.service.PaymentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DrugsController {
    @Autowired
    private DrugsService drugsService;

    @RequestMapping(method = RequestMethod.POST,value = "/addDrugs")
    public void addDrugs(@RequestBody Drugs drugs){
        drugsService.addDrugs(drugs);
    }
    @RequestMapping("/getAllDrugs")
    public List<Drugs> getAllDrugs(){
        return drugsService.getAllDrugs();
    }
    @RequestMapping(method = RequestMethod.PUT,value = "/updateDrugs/{id}")
    public void updateDrugs(@PathVariable Integer id, @RequestBody Drugs drugs){
        drugsService.updateDrugs(id,drugs);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/deleteDrugs/{id}")
    public void deleteDrugs(@PathVariable Integer id){
        drugsService.deleteDrugs(id);
    }
}
