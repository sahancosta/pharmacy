package com.pharmacy.application.pharmacy.repository;

import com.pharmacy.application.pharmacy.model.Login;
import org.springframework.data.repository.CrudRepository;

public interface LoginRepository extends CrudRepository<Login,Integer> {
}
