package com.example.Starter.Controllers;

import com.example.Starter.Models.Student;
import com.example.Starter.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class TestController {

    @Autowired
    StudentService studentService;

    @GetMapping("/hello")
    public String hello()
    {
        return "Hello World";
    }

    @GetMapping("/Students")
    public ResponseEntity<List<Student>> getStudents() {
        List<Student> list = studentService.getAllStudents();

        if (list.size() <= 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

    @GetMapping("/Students/{id}")
    public ResponseEntity<Student> getStudentByID(@PathVariable("id") int id) {
        Student Student = studentService.getStudentByID(id);
        if (Student == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(Student);
    }

    @PostMapping("/Students")
    public ResponseEntity<Student> setStudent(@RequestBody Student u) {
        Student Student = studentService.setStudent(u);
        if (Student == null)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        return ResponseEntity.status(HttpStatus.CREATED).body(Student);
    }

    @PutMapping("/Students")
    public ResponseEntity<Student> updateStudent(@RequestBody Student u) {
        Student Student = studentService.updateStudent(u);
        if (Student == null)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        return ResponseEntity.status(HttpStatus.CREATED).body(Student);
    }

    @DeleteMapping("/Students/{id}")
    public ResponseEntity<Student> deleteStudent(@PathVariable("id") int id) {
        Student Student = studentService.deleteStudent(id);
        if (Student == null)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        return ResponseEntity.status(HttpStatus.CREATED).body(Student);
    }
}
