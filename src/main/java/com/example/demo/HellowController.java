package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowController {

    @GetMapping("/a/b/mytest")
    public String hellow() {
        return "Hellow Jenkins X";
    }
}
