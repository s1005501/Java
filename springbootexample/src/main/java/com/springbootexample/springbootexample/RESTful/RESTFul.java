package com.springbootexample.springbootexample.RESTful;

import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class RESTFul {
    @Autowired
    JdbcTemplate jdbcTemplate;

    // Read-撈出來的資料如果是多筆的話建議用queryForList
    @GetMapping("/studentsRead")
    public List<Object> select() {
        List dataList = new ArrayList<>();
        String sql = "SELECT * FROM students WHERE 1";

        try {
            dataList = jdbcTemplate.queryForList(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataList;
    }

    // Create-透過RequestParam
    @PostMapping("/studentsCreate")
    public void insert(@RequestParam int age, String name) {
        String sql = "INSERT INTO students (name, age) VALUES ('" + name + "'," + age + ")";

        try {
            jdbcTemplate.execute(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Create-透過  
    // @PostMapping("/studentsCreate")
    // public void insert(HttpServletRequest request) {
    // String sql = "INSERT INTO students (name, age) VALUES ('" +
    // request.getParameter("name") + "','" + request.getParameter("age") + "')";

    // try {
    // jdbcTemplate.execute(sql);

    // } catch (Exception e) {
    // e.printStackTrace();
    // }
    // }

    // Update
    @PostMapping("/studentsUpdate")
    public void update(@RequestParam int age, String name) {
        String sql = "UPDATE students SET age='" + age + "' WHERE name='" + name + "'";

        try {
            jdbcTemplate.execute(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Delete
    @PostMapping("/studentsDelete")
    public void delete(@RequestParam String name) {
        String sql = "DELETE FROM students WHERE name='" + name + "'";

        try {
            jdbcTemplate.execute(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
