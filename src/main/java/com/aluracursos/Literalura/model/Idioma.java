package com.aluracursos.Literalura.model;


public class Idioma {
    private long id;
    private String Fr;
    private String Esp;
    private String Eng;
    private String Port;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFr() {
        return Fr;
    }

    public void setFr(String fr) {
        Fr = fr;
    }

    public String getEsp() {
        return Esp;
    }

    public void setEsp(String esp) {
        Esp = esp;
    }

    public String getEng() {
        return Eng;
    }

    public void setEng(String eng) {
        Eng = eng;
    }

    public String getPort() {
        return Port;
    }

    public void setPort(String port) {
        Port = port;
    }
}
