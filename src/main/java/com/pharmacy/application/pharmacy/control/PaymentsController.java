package com.pharmacy.application.pharmacy.control;

import com.pharmacy.application.pharmacy.model.Payments;
import com.pharmacy.application.pharmacy.service.PaymentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class PaymentsController {
    @Autowired
    private PaymentsService paymentsService;

    @RequestMapping(method = RequestMethod.POST,value = "/addPayments")
    public void addPayments(@RequestBody Payments payments){
        paymentsService.addPayments(payments);
    }
    @RequestMapping("/getAllPayments")
    public List<Payments> getAllPayments(){
        return paymentsService.getAllPayments();
    }
    @RequestMapping(method = RequestMethod.PUT,value = "/updatePayments/{id}")
    public void updatePayments(@PathVariable Integer id, @RequestBody Payments payments){
        paymentsService.updatePayments(id,payments);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/deletePayment/{id}")
    public void deletePayments(@PathVariable Integer id){
        paymentsService.deletePayments(id);
    }
}
