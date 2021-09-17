package com.pharmacy.application.pharmacy.repository;

import com.pharmacy.application.pharmacy.model.Drugs;
import org.springframework.data.repository.CrudRepository;

public interface DrugsRepository extends CrudRepository<Drugs,Integer> {
}
