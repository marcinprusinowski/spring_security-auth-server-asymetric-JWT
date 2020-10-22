package com.example.resourceserver.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class DemoController {

    @GetMapping("/demo")
    public String demo(){
        return "demo";
    }

    @GetMapping("/ok")
    public String ok(){
        return "ok";
    }

}
