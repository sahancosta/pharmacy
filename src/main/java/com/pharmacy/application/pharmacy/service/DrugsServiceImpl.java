package com.pharmacy.application.pharmacy.service;

import com.pharmacy.application.pharmacy.model.Drugs;
import com.pharmacy.application.pharmacy.model.Employee;
import com.pharmacy.application.pharmacy.repository.DrugsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DrugsServiceImpl implements DrugsService{
    @Autowired
    private DrugsRepository drugsRepository;
    @Override
    public void addDrugs(Drugs drugs) {
        drugsRepository.save(drugs);

    }

    @Override
    public List<Drugs> getAllDrugs() {
        List<Drugs> drugsList = new ArrayList<>();
        drugsRepository.findAll().forEach(drugsList::add);
        return drugsList;

    }

    @Override
    @Transactional
    public Optional<Drugs> updateDrugs(Integer id, Drugs drugs) {
        //drugs.setDrug_id(id);
        //drugsRepository.save(drugs);
        return drugsRepository.findById(id).map(e->{
            e.setDrug_name(drugs.getDrug_name());
            e.setDrug_type(drugs.getDrug_type());
            e.setDrug_price(drugs.getDrug_price());
            e.setDrug_capacity(drugs.getDrug_capacity());
            e.setBrand_id(drugs.getDrug_id());
            return e;

        });

    }

    @Override
    public void deleteDrugs(Integer id) {
        drugsRepository.deleteById(id);

    }

    @Override
    public Object getById(Integer id) {
        Optional<Drugs> drss = Optional.ofNullable(drugsRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid Id")));
        Drugs drugs = drss.get();
        return drugs;
    }


}
