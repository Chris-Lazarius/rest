package com.cyborgue.app.rest.Repo;

import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cyborgue.app.rest.Models.Register;


public interface RegisterRepo extends JpaRepository<Register, Long> {
    
}
