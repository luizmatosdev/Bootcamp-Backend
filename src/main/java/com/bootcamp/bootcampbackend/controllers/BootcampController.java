package com.bootcamp.bootcampbackend.controllers;

import com.bootcamp.bootcampbackend.entities.Bootcamp;
import com.bootcamp.bootcampbackend.services.BootcampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("bootcamp")
public class BootcampController {

    @Autowired
    private BootcampService bootcampService;

    @GetMapping
    public List<Bootcamp> getBootcampList() {
        return bootcampService.getBootcampList();
    }

}
