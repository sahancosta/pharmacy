package com.pharmacy.application.pharmacy.service;

import com.pharmacy.application.pharmacy.model.Payments;
import com.pharmacy.application.pharmacy.repository.PaymentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentsServiceImpl implements PaymentsService{
    @Autowired
    private PaymentsRepository paymentsRepository;

    @Override
    public void addPayments(Payments payments) {
        paymentsRepository.save(payments);
    }

    @Override
    public List<Payments> getAllPayments() {
        List<Payments> paymentsList = new ArrayList<>();
        paymentsRepository.findAll().forEach(paymentsList::add);
        return paymentsList;

    }

    @Override
    public void updatePayments(Integer id, Payments payments) {
        payments.setPay_id(id);
        paymentsRepository.save(payments);
    }

    @Override
    public void deletePayments(Integer id) {
        paymentsRepository.deleteById(id);

    }

}
