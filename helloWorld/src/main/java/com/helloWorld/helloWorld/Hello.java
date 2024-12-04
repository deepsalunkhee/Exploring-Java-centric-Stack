package com.helloWorld.helloWorld;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping("/")
    public String sayHello(){
        return "The Hello world from spring bott , lets see";
    }
}
