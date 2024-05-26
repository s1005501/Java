package com.springbootexample.springbootexample;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class DB2ConnectExample {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/DB2")
    public List<Object> test() {
        // HIS test DB
        List dataList = new ArrayList<>();
        StringBuffer sql = new StringBuffer();
        sql.append("SELECT * FROM ABSBMEDAPPSIZETBL WHERE ITEMNO = '01'");
        dataList = jdbcTemplate.queryForList(sql.toString());   
        
        return dataList;
    }
}

