package com.cyborgue.app.rest.Controller;

import com.cyborgue.app.rest.Models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cyborgue.app.rest.Repo.UserRepo;
import java.util.List;


@RestController
public class ApiControllers {
    /*
        POST, GET, PUT, DELETE. This are the functionality of a REST JP-API,
        done as CRUD Database functionality.

        we can only making use of the POST functionality only when we are creating data within 
     */


    @Autowired
    private UserRepo userRepo;
    
    @RequestMapping("/")
    @GetMapping(value = "/")
    @ResponseBody
    public String getPage()
    {
        
        return "Welcome Mr Chris";
    }

    
    //Over here we are geting the database's data using the GET functionality.
    
    @GetMapping(value = "/student")    
    public List<Student> getUsers()
    {
        return userRepo.findAll();
    }
    
    @PostMapping(value = "/save")
    public String saveStudent(@RequestBody Student student)
    {
        userRepo.save(student);
        return "Saved...";

    }

}
