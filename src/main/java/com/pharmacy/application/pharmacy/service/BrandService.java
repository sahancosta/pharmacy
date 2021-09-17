package com.pharmacy.application.pharmacy.service;

import com.pharmacy.application.pharmacy.model.Brand;


import java.util.List;
import java.util.Optional;

public interface BrandService {
    void addBrand(Brand brand);

    List<Brand> getAllBrand();

    public Optional<Brand> updateBrand(Integer id, Brand brand);

    void deleteBrand(Integer id);

    Object getById(Integer id);
}
