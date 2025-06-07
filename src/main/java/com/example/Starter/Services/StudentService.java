package com.example.Starter.Services;

import java.util.List;

public interface StudentService {
    List<String> getAllStudents();

    void setStudent(String student);
}