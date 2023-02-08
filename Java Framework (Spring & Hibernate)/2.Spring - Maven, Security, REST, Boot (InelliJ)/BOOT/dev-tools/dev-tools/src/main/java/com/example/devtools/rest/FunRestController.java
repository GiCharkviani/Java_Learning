package com.example.devtools.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    // inject properties for: coach.name and team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/")
    public String sayHello() {
        return "Hello World! Time on server is" + LocalDateTime.now();
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    @GetMapping("/fortune")
    public String getFortune() {
        return "You are lucky!";
    }

    // expose new endpoint for "team info"
    @GetMapping("/teaminfo/{yourName}")
    public String getTeamInfo(@PathVariable String yourName) {
        return "Coach: " + coachName + ", Team name: " + teamName + " >> Your name is: " + yourName;
    }
}
