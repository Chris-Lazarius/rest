package com.cyborgue.app.rest.Repo;

import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cyborgue.app.rest.Models.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {
    List<Student> findByLastNameStartsWithIgnoreCase(String sName);
    List<Student> findByStudentNameStartsWithIgnoreCase(String sName);
    
}
