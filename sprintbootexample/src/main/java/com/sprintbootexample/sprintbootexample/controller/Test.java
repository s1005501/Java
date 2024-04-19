package com.sprintbootexample.sprintbootexample.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Test {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/test")
    public List<Object> test() {
        // // XAMPP localhost DB
        // List dataList = new ArrayList<>();
        // StringBuffer sql = new StringBuffer();

        // sql.append("SELECT * FROM student WHERE id = 1");
        // dataList = jdbcTemplate.queryForList(sql.toString());

        // return dataList;

        // HIS test DB
        List dataList = new ArrayList<>();
        StringBuffer sql = new StringBuffer();
        sql.append("SELECT * FROM ABSBMEDAPPSIZETBL WHERE ITEMNO = '01'");
        dataList = jdbcTemplate.queryForList(sql.toString());

        return dataList;
    }

}
