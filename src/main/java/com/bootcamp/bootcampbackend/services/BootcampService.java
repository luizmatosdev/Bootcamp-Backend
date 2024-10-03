package com.bootcamp.bootcampbackend.services;

import com.bootcamp.bootcampbackend.entities.Bootcamp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BootcampService {

    public List<Bootcamp> getBootcampList() {
        return List.of(new Bootcamp());
    }
}
