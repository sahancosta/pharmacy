package com.pharmacy.application.pharmacy.control;

import com.pharmacy.application.pharmacy.model.Order;
import com.pharmacy.application.pharmacy.model.Payments;
import com.pharmacy.application.pharmacy.service.OrderService;
import com.pharmacy.application.pharmacy.service.PaymentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping(method = RequestMethod.POST,value = "/addOrder")
    public void addOrder(@RequestBody Order order){
        orderService.addOrder(order);
    }
    @RequestMapping("/getAllOrder")
    public List<Order> getAllOrder(){
        return orderService.getAllOrder();
    }
    @RequestMapping(method = RequestMethod.PUT,value = "/updateOrder/{id}")
    public void updateOrder(@PathVariable Integer id, @RequestBody Order order){
        orderService.updateOrder(id,order);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/deleteOrder/{id}")
    public void deleteOrder(@PathVariable Integer id){
        orderService.deleteOrder(id);
    }
}
