package com.aluracursos.Literalura.Controller;

import com.aluracursos.Literalura.Repository.IAuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class Controller {

    @GetMapping
    public String Hello(){

        System.out.println("el request es para proyecto Guttemberg");
        return "";
    }
}
