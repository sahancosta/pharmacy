package com.pharmacy.application.pharmacy.service;

import com.pharmacy.application.pharmacy.model.Payments;
import com.pharmacy.application.pharmacy.model.Returns;

import java.util.List;

public interface ReturnsService {
    void addReturns(Returns returns);

    List<Returns> getAllReturns();

    void updateReturns(Integer id, Returns returns);

    void deleteReturns(Integer id);
}
