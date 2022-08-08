package com.project.springbootapp.service;

import java.util.List;

import com.project.springbootapp.entity.Livro;
import com.project.springbootapp.repository.LivroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("livroService")
public class LivroServiceImpl implements LivroService {

    @Autowired
    private LivroRepository livroRepo;

    @Override
    @PreAuthorize("hasRole('ADMIN')")
    public Livro criaLivro(String titulo, String autor, String editora, Integer ano) {
        Livro livro = new Livro();
        livro.setTitulo(titulo);
        livro.setAutor(autor);
        livro.setEditora(editora);
        livro.setAno(ano);

        livroRepo.save(livro);

        return livro;   
    }

    @Override
    @PreAuthorize("isAuthenticated()")
    public List<Livro> buscarLivros() {
        return livroRepo.findAll();
    }
    
}
