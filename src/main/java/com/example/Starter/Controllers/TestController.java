package com.example.Starter.Controllers;

import com.example.Starter.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    StudentService studentService;

    @GetMapping("/hello")
    public String hello()
    {
        return "Hello World";
    }

    @GetMapping("/getAllStudents")
    public List<String> getAll(){
        return studentService.getAllStudents();
    }

    @PostMapping("/students")
    public void setStudent(@RequestBody String student) {
        studentService.setStudent(student);
    }
}
