//package com.aluracursos.Literalura.Service;
//import com.aluracursos.Literalura.model.Response;
//import com.fasterxml.jackson.databind.ObjectMapper;
//public class Deserializar {
//    public static void main(String[] args) {
//        try {
//            // Supongamos que tienes tu respuesta en formato JSON
//            String jsonResponse = json.body(); // Esto es el JSON que recibiste
//
//            // Crear una instancia de ObjectMapper
//            ObjectMapper objectMapper = new ObjectMapper();
//
//            // Deserializar el JSON en un objeto Response
//            Response responseObject = objectMapper.readValue(jsonResponse, Response.class);
//
//            // Ahora puedes usar responseObject como un objeto Java
//            System.out.println("Total de libros: " + responseObject.getCount());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
//
