package com.bootcamp.bootcampbackend.controllers;

import com.bootcamp.bootcampbackend.entities.Bootcamp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("bootcamp")
public class BootcampController {

    @GetMapping
    public List<Bootcamp> getBootcampList() {
        return getBootcampList();
    }

}
