package com.bootcamp.bootcampbackend.services;

import com.bootcamp.bootcampbackend.entities.Bootcamp;
import com.bootcamp.bootcampbackend.repositories.BootcampRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BootcampService {

    @Autowired
    private BootcampRepository bootcampRepository;

    public List<Bootcamp> getBootcampList() {
        return bootcampRepository.findAll();
    }
}
