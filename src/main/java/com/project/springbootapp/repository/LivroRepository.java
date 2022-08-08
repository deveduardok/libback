package com.project.springbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.springbootapp.entity.*;

public interface LivroRepository extends JpaRepository<Livro, Long>{
	
}
