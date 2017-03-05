package com.edu.heroku.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HerokuTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(HerokuTestApplication.class, args);
    }


    @RequestMapping(value = "/")
    public String home() {
        return "Hello World !";
    }
}
