package com.bootcamp.bootcampbackend.entities;

import com.bootcamp.bootcampbackend.entities.base.Content;

public class Activity extends Content {
    @Override
    public double xpCalculate() {
        return DEFAULT_XP + 20d;
    }
}
