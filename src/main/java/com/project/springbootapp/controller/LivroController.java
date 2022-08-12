package com.project.springbootapp.controller;

import java.util.List;

import com.project.springbootapp.entity.Livro;
import com.project.springbootapp.service.LivroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = "/livro")
public class LivroController {
    @Autowired
    private LivroService livroServ;

    @PostMapping(value = "/cadastrar")
    public Livro cadastrarLivro(@RequestBody LivroDTO livro){
        return livroServ.criaLivro(livro.getTitulo(), livro.getAutor(), livro.getEditora(), livro.getAno());
    }

    @GetMapping(value = "/listar")
    public List<Livro> buscarLivros(){
        return livroServ.buscarLivros();
    }
    

}