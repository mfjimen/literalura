package com.aluracursos.Literalura.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConvierteDatos implements IConvierteDatos {

    private static final Logger
    log = LoggerFactory.getLogger(ConvierteDatos.class);

       private ObjectMapper objectMapper = new ObjectMapper();

    @Override
        public <T> T obtenerDatos(String json, Class<T> clase) {
        try {
            return objectMapper.readValue(json,clase);
        } catch (JsonProcessingException e){
            throw new RuntimeException(e);
        }
    }
}








//        @Override
//        public <T> T obtenerDatos(String json, Class<T> clase) throws JsonProcessingException {
//return objectMapper.readValue(json,clase);
////                String jsonResponse = json;
//            // Imprimir el JSON recibido
//            System.out.println("JSON recibido: " + json);
//            // Verificar si el log está habilitado y luego imprimir el JSON
//            if(log.isInfoEnabled()){
//            log.info(json);}
//            try {
//                // Deserializar el JSON
//                Response responseObject = objectMapper.readValue(json, Response.class);
//                System.out.println("Total de libros: " + responseObject.getCount());
//                // Retornar el objeto deserializado
//            return (T) responseObject;
//            } catch (JsonProcessingException e) {
//                log.error("Error al deserializar el JSON: ", e);
//                throw e; // Re-lanzar la excepción si es necesario
//            }
//    }
