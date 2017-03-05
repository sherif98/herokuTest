package com.edu.heroku.test;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "/")
    public String home() {
        return "Hello World !";
    }

    @RequestMapping(value = "/test")
    public String home2() {
        return "Hello World ! test path";
    }

    @RequestMapping(value = "/dis")
    public String home3(@RequestParam String name) {
        return "your name is " + name;
    }

}
