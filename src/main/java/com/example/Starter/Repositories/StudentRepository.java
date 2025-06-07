package com.example.Starter.Repositories;

import com.example.Starter.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    // All Methods are Here , Except One
    Student findById(int id);
}