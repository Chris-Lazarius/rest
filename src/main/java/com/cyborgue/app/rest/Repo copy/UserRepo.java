package com.cyborgue.app.rest.Repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cyborgue.app.rest.Models.Student;

public interface UserRepo extends JpaRepository<Student, Long> {
    List<Student> findByLastNameStartsWithIgnoreCase(String sName);
    List<Student> findByStudentNameStartsWithIgnoreCase(String sName);
}
