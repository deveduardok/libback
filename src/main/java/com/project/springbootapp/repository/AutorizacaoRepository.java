package com.project.springbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.springbootapp.entity.*;
public interface AutorizacaoRepository extends JpaRepository<Autorizacao, Long>{

	public Autorizacao findByNome(String nome);
	
}
