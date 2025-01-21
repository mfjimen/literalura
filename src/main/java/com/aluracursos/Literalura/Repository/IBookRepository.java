package com.aluracursos.Literalura.Repository;

import com.aluracursos.Literalura.model.Author;
import com.aluracursos.Literalura.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Long>{
}
