package com.aluracursos.Literalura.model;

import com.aluracursos.Literalura.DTO.DatosBook;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name="Book")
@Entity(name="Book")
public class Book {
@Id
@GeneratedValue(GenerationType.IDENTITY)
    private int id;
    private String title;
    @Embedded
    private List<Author> authors;
    private List<String> subjects;
    private List<String> bookshelves;
    @Enumerated(EnumType.STRING)
    private List<String> languages;
    private boolean copyright;
    private String media_type;
    private int download_count;

    public Book(DatosBook datosBook) {
        this.title=datosBook.titulo();
        this.authors= Collections.unmodifiableList(datosBook.autores());
        this.subjects=datosBook.temas();
        this.bookshelves=datosBook.repisas();
        this.languages=datosBook.idiomas();
        this.copyright=datosBook.copyright();
        this.media_type=datosBook.tipoDeMedio();
        this.download_count=datosBook.numDeDescargas();
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public List<String> getBookshelves() {
        return bookshelves;
    }

    public void setBookshelves(List<String> bookshelves) {
        this.bookshelves = bookshelves;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public boolean isCopyright() {
        return copyright;
    }

    public void setCopyright(boolean copyright) {
        this.copyright = copyright;
    }

    public String getMedia_type() {
        return media_type;
    }

    public void setMedia_type(String media_type) {
        this.media_type = media_type;
    }

    public Map<String, String> getFormats() {
        return formats;
    }

    public void setFormats(Map<String, String> formats) {
        this.formats = formats;
    }

    public int getDownload_count() {
        return download_count;
    }

    public void setDownload_count(int download_count) {
        this.download_count = download_count;
    }
}
