package com.LearnGIT1.LearningHGIT.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mycontroller {
    @GetMapping("/")
    public String sayGoodmorning() {
        System.out.println("I am in the controller" +"vikas");
        return "Good morning Vikas";
    }

    @GetMapping("/hello")
    public String sayGoodEvening() {
        System.out.println("I am in the controller" +"vikas");

        // This is a comment
        return "Good Evening Vikas";
    }
    @GetMapping("/hi")
    public String sayGoodNight() {
        System.out.println("I am in the controller" +"sony");
        return "Good Night Vikas";
    }

    @GetMapping("/bye")
    public String sayGoodBye() {
        System.out.println("I am in the controller" +"master");
        return "Good Bye Vikas";
    }

    @GetMapping("/hello")
    public String sayHello() {
        System.out.println("I am in the controller" +"master");
        return "Hello Vikas";
    }
}

