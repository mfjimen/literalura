# Proyecto Literalura

Este proyecto es una aplicación de gestión de libros y autores, desarrollada en Java. Permite a los usuarios buscar libros, listar libros y autores registrados, y obtener información sobre autores vivos en un año determinado.

## Estructura del Proyecto

El proyecto está organizado en varios paquetes, cada uno con una responsabilidad específica:

- **com.aluracursos.Literalura.Principal**: Contiene la clase `Principal`, que muestra el menú de opciones al usuario y gestiona la interacción con el mismo.
  
- **com.aluracursos.Literalura.Controller**: Contiene los controladores que manejan las solicitudes HTTP para registrar libros y autores.
  
- **com.aluracursos.Literalura.DTO**: Contiene las clases de transferencia de datos (DTO) que se utilizan para recibir información de los libros y autores.
  
- **com.aluracursos.Literalura.Repository**: Contiene las interfaces para la gestión de datos de libros y autores.
  
- **com.aluracursos.Literalura.model**: Contiene las clases modelo que representan las entidades del sistema, como `Book` y `Author`.

## Funcionalidades

La aplicación ofrece las siguientes funcionalidades:

1. **Buscar libro por título**: Permite al usuario buscar un libro específico ingresando su título.
2. **Listar libros registrados**: Muestra todos los libros que han sido registrados en el sistema.
3. **Listar autores registrados**: Muestra todos los autores que han sido registrados en el sistema.
4. **Listar autores vivos en un determinado año**: Permite al usuario listar autores que estaban vivos en un año específico.
5. **Listar libros por idioma**: Permite al usuario listar libros según el idioma en que están escritos.
6. **Salir**: Opción para cerrar la aplicación.

## Cómo Ejecutar el Proyecto
1. Asegúrate de tener Java y Maven instalados en tu máquina.
2. Clona este repositorio en tu máquina local.
3. Navega al directorio del proyecto y ejecuta el siguiente comando para compilar y ejecutar la aplicación:
    ```bash
   mvn spring-boot:run
   Sigue las instrucciones en la consola para interactuar con la aplicación.
Contribuciones
Si deseas contribuir a este proyecto, siéntete libre de hacer un fork del repositorio y enviar un pull request con tus cambios.

Licencia
Este proyecto está bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.

Contacto
Para más información, puedes contactar al autor del proyecto a través de mfjimendez@hotmail.com.
