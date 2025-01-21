package com.aluracursos.Literalura.DTO;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public record DatosAuthor(
        @JsonAlias("name") String nombre,
        @JsonAlias("birth_year")  String agnoNace,
        @JsonAlias("dath_year") String agnoMuere
)

{
}
