package com.aluracursos.Literalura;
import com.aluracursos.Literalura.Principal.Principal;
import com.aluracursos.Literalura.Service.ConsumoApi;
//import com.aluracursos.Literalura.Service.ConvierteDatos;
import com.aluracursos.Literalura.Service.ConvierteDatos;
import com.aluracursos.Literalura.model.Author;
import com.aluracursos.Literalura.model.Book;
import com.aluracursos.Literalura.DTO.DatosResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {
    @Autowired

    public static void main(String[] args) {

        SpringApplication.run(LiteraluraApplication.class, args);

        @Override
        public void run(String... args); throws Exception {
            Principal principal = new Principal(repository);
            principal.muestraElMenu();

    }
    @Override
    public void run(String... args) throws Exception {
        Integer Seleccion = 0;

        var consumoApi = new ConsumoApi();
        var json = consumoApi.obtenerDatos("https://gutendex.com/books/");
        System.out.println(json);
        Seleccion = lecture.nextInt();

        ConvierteDatos conversor = new ConvierteDatos();
        var datos = conversor.obtenerDatos(json, DatosResponse.class);
*************************************************
        ******************************************
        ******************************AQUI VOY
        @Override
        public void run(String... args) throws Exception {
            Principal principal = new Principal(repository);
            principal.muestraElMenu();

            public Principal(SerieRepository repository) {

                this.repository = repository;
            }


// Asegúrate de que DatosResponse tiene un método getResults() que devuelve una lista de libros
        for (Book libro : datos.getResults()) {
            System.out.println("Título: " + libro.getTitle());
            for (Author autor : libro.getAuthors()) {
                System.out.println("Nombre del autor: " + autor.getName());
                System.out.println("Año de nacimiento: " + autor.getBirthYear());
                System.out.println("Año de fallecimiento: " + autor.getDeathYear());

            }

//        json=consumoApi.obtenerDatos("https://gutendex.com/books?languages=en");
//        System.out.println(json);
//        DatosAuthor Author = conversor.obtenerDatos(json,DatosAuthor.class);

    }
            }

        }}}


/*
    DatosAutores datosAutores = conversor.obtenerDatos(json, DatosAutores.class);
    System.out.println(datosAutores);
*/

