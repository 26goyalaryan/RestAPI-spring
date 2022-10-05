package com.email.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// spring mvc -> The Spring Web model-view-controller

@RestController

// Rest controller is used to create Restful Web Services using MVC
// REST - Representational state transfer API is a way to access web Service
// in a simple and flexible way

public class EmailController {
// RequestMapping annotation is used to map web requests onto specific handler
// classes and/or handler methods.
// @RequestMapping can be applied to the controller class as well as methods.

    @RequestMapping("/welcome") // get method --> will call welcome
    public String welcome(){
        return "hello this is my email api";
    }
}
