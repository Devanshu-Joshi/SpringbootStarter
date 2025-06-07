package com.example.Starter.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    List<String> students = new ArrayList<>();

    String student1 = "Narendra Modi";
    String student2 = "Mukesh Ambani";
    String student3 = "Elon Musk";

    public StudentServiceImpl() {
        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<String> getAllStudents() {
        return students;
    }

    public void setStudent(String student) {
        students.add(student);
    }
}