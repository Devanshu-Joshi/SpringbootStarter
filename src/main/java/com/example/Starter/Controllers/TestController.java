package com.example.Starter.Controllers;

import com.example.Starter.Services.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class TestController {

    StudentService StudentService;

    @GetMapping("/hello")
    public String hello()
    {
        return "Hello World";
    }

    @GetMapping("/getAllStudents")
    public List<String> getAll(){
        // ??
    }
}
