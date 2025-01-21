package com.aluracursos.Literalura.Principal;

import java.util.Scanner;

public class Principal {
    private Scanner teclado = new Scanner(System.in);
    public void muestraElMenu() {
        var opcion = -1;
        while (opcion != 0) {
            System.out.println();// Para agregar una línea en blanco entre libros
            Scanner lecture = new Scanner(System.in);
            var menu = """
                Elija la opción a través de su número:\s
                
                1- \t\tBuscar libro por título
                2- \t\tListar libros registrados
                3- \t\tListar autores registrados
                4- \t\tListar autores vivos un determinado año
                5- \t\tListar libros por idioma
                0- \t\tSalir""";



            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    buscarTitulo();
                    break;
                case 2:
                    listarLibrosBuscados();
                    break;
                case 3:
                    listarAutoresBuscados();
                    break;
                case 4:
                    listarAutoresVivosAlAgno();
                    break;
                case 5:
                    istarLibrosPorIdioma();
                    break;
                case 0:
                    System.out.println("Cerrando la aplicación...");
                    break;
                default:
                    System.out.println("Opción inválida");

            }