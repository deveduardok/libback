package com.project.springbootapp.service;

import java.util.List;

import com.project.springbootapp.entity.Livro;

public interface LivroService {

    public Livro criaLivro(String titulo, String autor, String editora, Integer ano);

    public List<Livro> buscarLivros();
                
}
