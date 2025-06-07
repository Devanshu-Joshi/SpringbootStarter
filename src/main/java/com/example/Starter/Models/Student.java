package com.example.Starter.Models;

import jakarta.persistence.Entity;

@Entity
public class Student {

    private int id;

    private String name;

    private String role;

    private String city;

    public Student() {
        super();
    }

    public Student(int id, String name, String role, String city) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.city = city;
    }

}
