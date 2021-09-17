package com.pharmacy.application.pharmacy.service;

import com.pharmacy.application.pharmacy.model.Login;

import java.util.List;

public interface LoginService {
    void addLogin (Login login);

    List<Login> getAllLogin();

    void updateLogin(Integer id,Login login);

    void deleteLogin(Integer id);
}
