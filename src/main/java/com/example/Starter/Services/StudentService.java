package com.example.Starter.Services;

import com.example.Starter.Models.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student getStudentByID(int id);

    Student setStudent(Student Student);

    Student updateStudent(Student Student);

    Student deleteStudent(int id);
}