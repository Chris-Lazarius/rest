package com.cyborgue.app.rest;

import org.aspectj.weaver.patterns.ArgsAnnotationPointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cyborgue.app.rest.Models.Student;
import com.cyborgue.app.rest.Repo.UserRepo;


@RestController
@SpringBootApplication
public class RestApplication {

	private static final Logger log = LoggerFactory.getLogger(RestApplication.class);

	@GetMapping(value = "/")
    public String getPage2()
    {
        return "Hello Mr Chris";
        
    }


	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

	


}