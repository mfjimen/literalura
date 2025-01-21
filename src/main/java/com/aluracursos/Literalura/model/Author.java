package com.aluracursos.Literalura.model;

import com.aluracursos.Literalura.DTO.DatosAuthor;
import com.aluracursos.Literalura.DTO.DatosBook;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Embeddable;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Embeddable
public class Author extends Book {

    private String name;
    private int birth_year;
    private int death_year;

    public Author(DatosAuthor datosAuthor) {
        super(datosAuthor);
    }


    public Author(@NotNull List<Author> datosAuthor) {
        this.name= datosAuthor.nombre();
        this.birth_year= datosAuthor.agnoNace();
        this.death_year= datosAuthor.agnoMuere();
        super();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(int birth_year) {
        this.birth_year = birth_year;
    }

    public int getDeath_year() {
        return death_year;
    }

    public void setDeath_year(int death_year) {
        this.death_year = death_year;
    }

    // Métodos corregidos para devolver los años de nacimiento y fallecimiento
    public int getBirthYear() {
        return birth_year;
    }

    public int getDeathYear() {
        return death_year;
    }
}
