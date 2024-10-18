package com.bootcamp.bootcampbackend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public record Student(
        @Id
        int id,
        @Column
        String name,
        @OneToMany
        @JoinColumn()
        List<Bootcamp> bootcamps
) {
}
