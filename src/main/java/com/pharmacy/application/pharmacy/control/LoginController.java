package com.pharmacy.application.pharmacy.control;

import com.pharmacy.application.pharmacy.model.Login;
import com.pharmacy.application.pharmacy.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoginController {
   @Autowired
   private LoginService loginService;

    @RequestMapping(method = RequestMethod.POST,value = "/addLogin")
    public void addLogin(@RequestBody Login login){
        loginService.addLogin(login);
    }
    @RequestMapping("/getAllLogin")
    public List<Login> getAllLogin(){
        return loginService.getAllLogin();
    }
    @RequestMapping(method = RequestMethod.PUT,value = "/updateLogin/{id}")
    public void updateLogin(@PathVariable Integer id, @RequestBody Login login){
        loginService.updateLogin(id,login);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/deleteLogin/{id}")
    public void deleteLogin(@PathVariable Integer id){
        loginService.deleteLogin(id);
    }
}
