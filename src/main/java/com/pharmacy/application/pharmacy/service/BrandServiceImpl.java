package com.pharmacy.application.pharmacy.service;

import com.pharmacy.application.pharmacy.model.Brand;

import com.pharmacy.application.pharmacy.model.Employee;
import com.pharmacy.application.pharmacy.repository.BrandRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BrandServiceImpl implements BrandService{
    @Autowired
    private BrandRepository brandRepository;

    @Override
    public void addBrand(Brand brand) {
        brandRepository.save(brand);
    }

    @Override
    public List<Brand> getAllBrand() {
        List<Brand> brandList = new ArrayList<>();
        brandRepository.findAll().forEach(brandList::add);
        return brandList;
    }
    @Override
    @Transactional
    public Optional<Brand> updateBrand(Integer id, Brand brands) {
        //brands.setBrand_id(id);
        //brandRepository.save(brands);
        return brandRepository.findById(id).map(e->{
            e.setComp_name(brands.getComp_name());
            e.setComp_desc(brands.getComp_desc());
            return e;

        });
    }

    @Override
    public void deleteBrand(Integer id) {
        brandRepository.deleteById(id);

    }

    @Override
    public Object getById(Integer id) {
        Optional<Brand> brn = Optional.ofNullable(brandRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid Id")));
        Brand brand = brn.get();
        return brand;
    }
}
