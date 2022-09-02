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

	@RequestMapping("/")
	public String sMessage()
	{
		return "Hi Admin";
	}

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(UserRepo urepository)
	{
		return (args) ->
		{
			//Over here I'm saving some students
			urepository.save(new Student("Chris", "761 Coley", "Lazariuscm@gmail.com", "12344321"));
			urepository.save(new Student("Arthur", "753 Corobay", "Arthur@gmail.com", "1234554321"));
			urepository.save(new Student("Tom", "951 9th Ave", "Tom@gmail.com", "123321"));

			// fetch all student
			log.info("Student found with findAll():");
			log.info("-------------------------------");
			for (Student student : urepository.findAll()) {
				log.info(student.toString());
			}
			log.info("");

			// fetch an individual student by ID
			Student student = urepository.findById(1L).get();
			log.info("Student found with findOne(1L):");
			log.info("--------------------------------");
			log.info(student.toString());
			log.info("");

			// fetch customers by last name
			log.info("Student found with findByStudentNameStartsWithIgnoreCase('Chris'):");
			log.info("--------------------------------------------");
			for (Student chris : urepository
					.findByLastNameStartsWithIgnoreCase("Chris")) {
				log.info(chris.toString());
			}
			log.info("");

		};
	}


}