package com.praveen.jenkins_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/hello")
    public String sayHello(){
        System.out.println("hello world");
        return "Hello World";
    }
}
