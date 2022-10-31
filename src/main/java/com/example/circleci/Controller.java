package com.example.circleci;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @RequestMapping(value = "/")
    public String uploadApk() {

        return "index";
    }

    //Get request
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
