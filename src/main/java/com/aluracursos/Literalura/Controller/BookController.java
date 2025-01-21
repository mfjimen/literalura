package com.aluracursos.Literalura.Controller;

import com.aluracursos.Literalura.DTO.DatosAuthor;
import com.aluracursos.Literalura.DTO.DatosBook;
import com.aluracursos.Literalura.Repository.IBookRepository;
import com.aluracursos.Literalura.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



public class BookController {

@Autowired
    private IBookRepository iBookRepository;


    @PostMapping
    public void registrarBook(@RequestBody DatosBook datosBook){
        iBookRepository.save(new Book(datosBook));
        System.out.println(datosBook);
}}
