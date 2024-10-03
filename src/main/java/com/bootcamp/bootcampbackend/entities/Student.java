package com.bootcamp.bootcampbackend.entities;

import com.bootcamp.bootcampbackend.entities.base.Content;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private List<Content> contents;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Content> getContents() {
        return contents;
    }
}
