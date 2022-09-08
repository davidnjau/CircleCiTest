package com.example.circleci;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@org.springframework.stereotype.Controller
public class Controller {


    @RequestMapping(value = "/")
    public String uploadApk() {

        return "index";
    }
}
