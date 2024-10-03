package com.bootcamp.bootcampbackend.entities.base;

public abstract class Content {
    protected static final double DEFAULT_XP = 15d;

    private int id;
    private String title;
    private String description;

    public abstract double xpCalculate();

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
