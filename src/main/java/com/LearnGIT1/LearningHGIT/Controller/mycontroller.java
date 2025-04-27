package com.LearnGIT1.LearningHGIT.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mycontroller {
    @GetMapping("/")
    public String sayhello() {
        System.out.println("I am in the controller" +"vikas");
        return "Hello Vikas";
    }
}
