package com.bootcamp.bootcampbackend.entities;

import java.time.LocalDate;
import java.util.List;

public class Bootcamp {
    private int id;
    private String name;
    private String description;
    private int creditHours;
    private LocalDate startDate;
    private LocalDate endDate;
    private Mentoring mentoring;
    private List<Student> students;
    private List<Activity> activities;

    public List<Student> getEnrolledStudents() {
        return students;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public Mentoring getMentoring() {
        return mentoring;
    }

    public List<Activity> getActivities() {
        return activities;
    }
}
