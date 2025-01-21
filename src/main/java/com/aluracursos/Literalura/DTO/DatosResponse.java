package com.aluracursos.Literalura.DTO;

import java.util.List;

import com.aluracursos.Literalura.model.Book;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosResponse(
        @JsonAlias("count") int contador,
        @JsonAlias("next") String cambiopag,
                @JsonAlias("previous") String paganterior,
                @JsonAlias("results") List<Book> totalInfo
){

    public List<Book> getResults() {
        return totalInfo; // Devuelve la lista de libros
    }

    }
