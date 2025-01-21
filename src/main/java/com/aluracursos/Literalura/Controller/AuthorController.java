package com.aluracursos.Literalura.Controller;

import com.aluracursos.Literalura.DTO.DatosAuthor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class AuthorController {
    @PostMapping
    public void registrarAuthor(@RequestBody DatosAuthor datosAuthor){
        System.out.println(datosAuthor);
    }
}