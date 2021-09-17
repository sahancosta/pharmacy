package com.pharmacy.application.pharmacy.service;

import com.pharmacy.application.pharmacy.model.Drugs;
import com.pharmacy.application.pharmacy.model.Employee;
import com.pharmacy.application.pharmacy.model.Payments;

import java.util.List;
import java.util.Optional;

public interface DrugsService {
    void addDrugs(Drugs drugs);
    List<Drugs> getAllDrugs();

    public Optional<Drugs> updateDrugs(Integer id, Drugs drugs);

    void deleteDrugs(Integer id);

    Object getById(Integer id);
}
