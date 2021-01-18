package io.developerkhusanjon.RoleBasedAuth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping({"/","","home"})
    public String home(){
        return "<h1>Welcome to Home</h1>";
    }
}
