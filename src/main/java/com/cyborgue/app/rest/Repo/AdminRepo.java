package com.cyborgue.app.rest.Repo;

import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cyborgue.app.rest.Models.Administrator;

public interface AdminRepo extends JpaRepository<Administrator, Long> {
    
}
