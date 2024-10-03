package com.bootcamp.bootcampbackend.entities;

import com.bootcamp.bootcampbackend.entities.base.Content;

import java.time.LocalDate;

public class Mentoring extends Content {
    private LocalDate dateOfMentoring;

    @Override
    public double xpCalculate() {
        return DEFAULT_XP + 15d;
    }

    public LocalDate getDateOfMentoring() {
        return dateOfMentoring;
    }
}
