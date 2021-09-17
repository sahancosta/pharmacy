package com.pharmacy.application.pharmacy.control;


import com.pharmacy.application.pharmacy.model.Returns;
import com.pharmacy.application.pharmacy.service.ReturnsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReturnsController {
    @Autowired
    private ReturnsService returnsService;

    @RequestMapping(method = RequestMethod.POST,value = "/addReturns")
    public void addReturns(@RequestBody Returns returns){
        returnsService.addReturns(returns);
    }
    @RequestMapping("/getAllReturns")
    public List<Returns> getAllReturns(){
        return returnsService.getAllReturns();
    }
    @RequestMapping(method = RequestMethod.PUT,value = "/updateReturns/{id}")
    public void updateReturns(@PathVariable Integer id, @RequestBody Returns returns){
        returnsService.updateReturns(id,returns);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/deleteReturns/{id}")
    public void deleteReturns(@PathVariable Integer id){
        returnsService.deleteReturns(id);
    }
}
