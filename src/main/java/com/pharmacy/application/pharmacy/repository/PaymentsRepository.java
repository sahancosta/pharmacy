package com.pharmacy.application.pharmacy.repository;

import com.pharmacy.application.pharmacy.model.Payments;
import org.springframework.data.repository.CrudRepository;

public interface PaymentsRepository extends CrudRepository<Payments, Integer> {
}
