package com.epita.orangestoremanagement.service;

import com.epita.orangestoremanagement.model.Orange;
import com.epita.orangestoremanagement.repository.OrangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrangeService {

    private final OrangeRepository orangeRepository;

    @Autowired
    public OrangeService(OrangeRepository orangeRepository) {
        this.orangeRepository = orangeRepository;
    }

    public List<Orange> getAllOranges() {
        return orangeRepository.findAll();
    }
}
