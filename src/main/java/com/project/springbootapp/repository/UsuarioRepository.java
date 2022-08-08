package com.project.springbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.springbootapp.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	public Usuario findByEmail(String email);
	
}
