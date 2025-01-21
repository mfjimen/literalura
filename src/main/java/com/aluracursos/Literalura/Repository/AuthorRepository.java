package com.aluracursos.Literalura.Repository;

import com.aluracursos.Literalura.DTO.DatosAuthor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class AuthorRepository {



        @Autowired
        private IAuthorRepository iAuthorRepository;
        @GetMapping
        public void  Author(@RequestBody DatosAuthor datosAuthor);
        iAuthorRepository.save(new Author(datosAuthor));{
            System.out.println(DatosBook);
        }
    }


