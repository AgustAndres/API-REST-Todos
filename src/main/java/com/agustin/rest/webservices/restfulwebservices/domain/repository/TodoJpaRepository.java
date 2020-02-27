package com.agustin.rest.webservices.restfulwebservices.domain.repository;

import com.agustin.rest.webservices.restfulwebservices.domain.Todo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoJpaRepository extends JpaRepository<Todo, Long>{
    List<Todo> findByUsername(String username);
    
    List<Todo> findByUsername(Long username);
}
