package com.springbootexample.springbootexample.RESTful;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class StudentController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/students")
    public List<Object> select() {
        List dataList = new ArrayList<>();
        // StringBuffer sql = new StringBuffer();
        // sql.append("SELECT * FROM member WHERE 1");
        // dataList = jdbcTemplate.queryForList(sql.toString());

        String sql = "SELECT * FROM member WHERE 1";

        dataList = jdbcTemplate.queryForList(sql);

        return dataList;
    }

}
