package org.doukou.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {
    @GetMapping("/user")
    public String user(){
        return "User";
    }
}
