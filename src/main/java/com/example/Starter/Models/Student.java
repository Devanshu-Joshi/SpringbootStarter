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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", role=" + role + ", city=" + city + "]";
    }

}
