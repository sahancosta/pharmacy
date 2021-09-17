package com.pharmacy.application.pharmacy.service;

import com.pharmacy.application.pharmacy.model.Returns;
import com.pharmacy.application.pharmacy.repository.ReturnsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReturnsServiceImpl implements ReturnsService {
    @Autowired
    private ReturnsRepository returnsRepository;

    @Override
    public void addReturns(Returns returns) {
        returnsRepository.save(returns);

    }

    @Override
    public List<Returns> getAllReturns() {
        List<Returns> returnsList = new ArrayList<>();
        returnsRepository.findAll().forEach(returnsList::add);
        return returnsList;

    }

    @Override
    public void updateReturns(Integer id, Returns returns) {
        returns.setRet_id(id);
        returnsRepository.save(returns);

    }

    @Override
    public void deleteReturns(Integer id) {
        returnsRepository.deleteById(id);

    }
}
