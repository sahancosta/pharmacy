package com.pharmacy.application.pharmacy.repository;

import com.pharmacy.application.pharmacy.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository <Order, Integer> {
}
