package com.example.taskmanager.model;

import jakarta.persistence.*;

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
    private LocalDateTime dataHoraVencimento;
    @ManyToOne(cascade = CascadeType.ALL)
    private Categoria categoria;
    @ManyToOne(cascade = CascadeType.ALL)
    private Disciplina disciplina;
    @ManyToOne(cascade = CascadeType.ALL)
    private Usuario usuario;

    private boolean concluida = false;
    private boolean vencida = false;
    private boolean atrasada = false;

    public Tarefa(String nome, Categoria categoria, Disciplina disciplina, LocalDateTime dataHoraVencimento) {
        this.nome = nome;
        this.categoria = categoria;
        this.disciplina = disciplina;
        this.dataHoraVencimento = dataHoraVencimento;
    }

    public Tarefa() {

    }

    public boolean isVencida() {
        return vencida;
    }

    public void setVencida(boolean vencida) {
        this.vencida = vencida;
    }

    public LocalDateTime getDataHoraVencimento() {
        return dataHoraVencimento;
    }

    public void setDataHoraVencimento(LocalDateTime dataHoraVencimento) {
        this.dataHoraVencimento = dataHoraVencimento;
    }

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


