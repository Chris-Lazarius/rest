package com.cyborgue.app.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiControllers {
    @GetMapping(value = "/")
    public String getPage()
    {
        //System.out.println("Hi Mr Chris, how are you doing?");
        return "Welcome Mr Chris";
    }
}
