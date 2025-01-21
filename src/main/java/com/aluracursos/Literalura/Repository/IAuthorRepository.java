package com.aluracursos.Literalura.Repository;

import com.aluracursos.Literalura.model.Author;
import com.aluracursos.Literalura.model.Book;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.json.JsonParser;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;
public interface IAuthorRepository extends JpaRepository<Author, Long> {
}
