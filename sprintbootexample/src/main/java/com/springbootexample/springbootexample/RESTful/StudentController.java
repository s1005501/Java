package com.springbootexample.springbootexample.RESTful;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class StudentController {

    @PostMapping("/students")
    public String create(@RequestBody Student student) {

        return "執行DB的CREATE";
    }

}
