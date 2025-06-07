package com.example.Starter.Services;

import java.util.ArrayList;
import java.util.List;
import com.example.Starter.Models.Student;
import com.example.Starter.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public Student getStudentByID(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student setStudent(Student Student) {
        if (Student == null)
            return null;

        Student = studentRepository.save(Student);
        return Student;
    }

    @Override
    public Student updateStudent(Student Student) {
        if (Student == null)
            return null;

        Student = studentRepository.save(Student);
        return Student;
    }

    public Student deleteStudent(int id) {
        if (id <= 0)
            return null;
        Student Student = studentRepository.findById(id);
        studentRepository.deleteById(id);
        return Student;
    }
}