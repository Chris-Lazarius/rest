package com.cyborgue.app.rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cyborgue.app.rest.Models.Student;

public interface UserRepo extends JpaRepository<Student, Long> {
    
}
