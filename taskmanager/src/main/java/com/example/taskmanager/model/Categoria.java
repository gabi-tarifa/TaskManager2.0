package com.example.taskmanager.model;

public class Categoria {
    private String nome;
    private int id;
    private static int idbase;
    private boolean urgente, importante;

    public Categoria(String nome, boolean urgente, boolean importante) {
        this.nome = nome;
        this.id = idbase++;
        this.urgente = urgente;
        this.importante = importante;
    }

    public boolean isUrgente() {
        return urgente;
    }

    public void setUrgente(boolean urgente) {
        this.urgente = urgente;
    }

    public boolean isImportante() {
        return importante;
    }

    public void setImportante(boolean importante) {
        this.importante = importante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

