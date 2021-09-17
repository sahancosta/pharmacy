package com.pharmacy.application.pharmacy.service;

import com.pharmacy.application.pharmacy.model.Login;
import com.pharmacy.application.pharmacy.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    private LoginRepository loginRepository;

    @Override
    public void addLogin(Login login) {
        loginRepository.save(login);

    }

    @Override
    public List<Login> getAllLogin() {
        List<Login> loginList = new ArrayList<>();
        loginRepository.findAll().forEach(loginList::add);
        return loginList;
    }

    @Override
    public void updateLogin(Integer id, Login login) {
        login.setEmpy_id(id);
        loginRepository.save(login);

    }

    @Override
    public void deleteLogin(Integer id) {
        loginRepository.deleteById(id);

    }
}
