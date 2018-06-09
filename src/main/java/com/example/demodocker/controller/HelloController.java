package com.example.demodocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 */
@RestController
public class HelloController {

    @GetMapping(path = "/hello")
    public String hello() {
        return "halo gan...apa kabar wkwkwk?";
    }

    @GetMapping(path = "/greet/{name}")
    public String greet(@PathVariable String name){
        return "halo " + name;
    }
}