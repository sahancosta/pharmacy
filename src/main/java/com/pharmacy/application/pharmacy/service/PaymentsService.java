package com.pharmacy.application.pharmacy.service;

import com.pharmacy.application.pharmacy.model.Payments;

import java.util.List;

public interface PaymentsService {
    void addPayments(Payments payments);

    List<Payments> getAllPayments();

    void updatePayments(Integer id, Payments payments);

    void deletePayments(Integer id);
}
