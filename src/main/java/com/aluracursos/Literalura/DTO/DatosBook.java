package com.aluracursos.Literalura.DTO;

import com.aluracursos.Literalura.model.Author;
import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;
import java.util.Map;

public record DatosBook(
        @JsonAlias("title") String titulo,
        @JsonAlias("authors") List<Author> autores,
        @JsonAlias("subjects") List<String> temas,
        @JsonAlias("bookshelves") List<String> repisas,
        @JsonAlias("languages")  List<String> idiomas,
        boolean copyright,
        @JsonAlias("media_type") String tipoDeMedio,
        @JsonAlias("formats") Map<String, String> formatos,
        @JsonAlias("download_count") int numDeDescargas
) {
}
