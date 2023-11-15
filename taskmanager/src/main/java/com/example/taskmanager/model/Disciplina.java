package com.example.taskmanager.model;

public class Disciplina {
    private String nome;
    private String codigo;
    private int id;
    private int idbase;

    public Disciplina(String nome, String codigo) {
        this.nome = nome;
        this.id = idbase++;
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

}
