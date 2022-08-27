package com.cyborgue.app.rest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cyborgue.app.rest.Repo.UserRepo;

import antlr.collections.List;

@RestController
public class ApiControllers {
    
    @Autowired
    private UserRepo userRepo;
    
    @GetMapping(value = "/")
    public String getPage()
    {
        
        return "Welcome Mr Chris";
    }

    /*
    @GetMapping()
    public List<Student> getUsers()
    {
        return userRepo.findAll();
    }
    */

}
