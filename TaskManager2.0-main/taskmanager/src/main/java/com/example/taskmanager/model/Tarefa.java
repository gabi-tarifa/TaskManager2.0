package com.example.taskmanager.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;

@Entity
@Table
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nome;
    @Column
    private boolean importante;
    @Column
    private boolean urgente;


    //@Column
    //private LocalDate dataVencimento;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idCategoria")
    private Categoria categoria;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idDisciplina")
    private Disciplina disciplina;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    private boolean concluida = false;
    private boolean vencida = false;
    private boolean atrasada = false;

    public Tarefa(String nome, Categoria categoria, Disciplina disciplina, boolean urgente, boolean importante/*, LocalDate dataVencimento*/) {
        this.nome = nome;
        this.categoria = categoria;
        this.disciplina = disciplina;
        this.urgente = urgente;
        this.importante = importante;
        //this.dataVencimento = dataVencimento;
    }

    public Tarefa() {

    }

    /*public boolean isVencida() {
        return vencida;
    }

    public void setVencida(boolean vencida) {
        this.vencida = vencida;
    }*/

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
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

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public boolean isAtrasada() {
        return atrasada;
    }

    public void setAtrasada(boolean atrasada) {
        this.atrasada = atrasada;
    }

}


