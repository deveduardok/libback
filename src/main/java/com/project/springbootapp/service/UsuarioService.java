package com.project.springbootapp.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.project.springbootapp.entity.*;
public interface UsuarioService extends UserDetailsService {
	
	public Usuario novoUsuario(String nome, String email, 
			String senha, String autorizacao);

}
