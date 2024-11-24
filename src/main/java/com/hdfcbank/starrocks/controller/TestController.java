package com.hdfcbank.starrocks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/test/{id}")
    public String testConnection(@PathVariable("id") int id) {
        return jdbcTemplate.queryForObject("SELECT name from employees where id = " + id, String.class);
    }
}
