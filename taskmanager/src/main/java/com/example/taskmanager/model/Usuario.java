package com.example.taskmanager.model;

import jakarta.persistence.*;
import org.hibernate.engine.internal.Cascade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDateTime;

@Entity
@Table
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String nome;
    private int totalConcluidas;


    @Column(unique = true)
    private String matricula;
    @Column
    private String senha;
    private boolean logado = false;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Tarefa> tarefas = new ArrayList<>();

    public Usuario(String nome, String matricula, String senha) {
        this.nome = nome;
        this.matricula = matricula;
        this.senha = senha;
    }

    public Usuario() {

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getId() {
        return id;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }
    /*


    public boolean login(String matricula, String senha) {
        if (matricula.equals(this.matricula) && senha.equals(this.senha)) {
            logado = true;
            return true;
        } else {
            System.out.println("Endereço ou senha incorretos...");
            logado = false;
            return false;
        }
    }

    public void logout() {
        logado = false;
    }

    public void alterarSenha() {
        if (!logado) {
            System.out.println("Você deve estar logado para alterar alguma senha. ");
            return;
        } else {
            String newSenha, confirmSenha, senha;
            try (Scanner scan = new Scanner(System.in)) {
                System.out.print("Confirme sua senha: ");
                senha = scan.nextLine();
                do {
                    newSenha = "";
                    confirmSenha = "";
                    if (confirmarSenha(senha)) {
                        System.out.print("Digite uma nova senha: ");
                        newSenha = scan.nextLine();
                        System.out.print("Confirme a senha: ");
                        confirmSenha = scan.nextLine();
                        if (newSenha.equals(confirmSenha)) {
                            this.senha = newSenha;
                        } else {
                            System.out.println("As senhas não correspondem, tente novamente");
                            senha = "";
                            System.out.print("Confirme sua senha: ");
                            senha = scan.nextLine();
                        }
                    } else {
                        System.out.println("Senha incorreta. Tente novamente");
                        senha = scan.nextLine();
                    }
                    if (!newSenha.equals(confirmSenha)) {
                        senha = "";
                        System.out.print("Confirme sua senha: ");
                        senha = scan.nextLine();
                    }
                } while (!newSenha.equals(this.senha));
                newSenha = null;
                confirmSenha = null;
            }
        }
    }

    private boolean confirmarSenha(String senha) {
        if (senha.equals(this.senha)) {
            return true;
        }
        return false;
    }

    public void addTarefa(Tarefa tarefa) {
        if (logado) {
            tarefas.add(tarefa);
        } else {
            System.out.println("Você deve estar logado para adicionar uma tarefa");
        }
    }

    public void removeTarefa(Tarefa tarefa) {
        if (logado) {
            tarefas.remove(tarefa);
        } else {
            System.out.println("Você deve estar logado para remover uma tarefa");
        }
    }

    public void alterarTarefa(Tarefa tarefa, Tarefa novaTarefa) {
        if (logado) {
            tarefas.add(novaTarefa);
            tarefas.remove(tarefa);
            System.out.println("Alteração de tarefa bem-sucedida!!");
        } else {
            System.out.println("Você deve estar logado para alterar uma tarefa");
        }
    }

    public void terminarTarefa(Tarefa tarefa) {
        if (logado) {
            LocalDateTime horaEnvio = LocalDateTime.now();
            tarefa.setConcluida(true);
            if (horaEnvio.isAfter(tarefa.getDataHoraVencimento())) {
                tarefa.setAtrasada(true);
            }
        } else {
            System.out.println("Você deve estar logado para enviar uma tarefa");
        }
    }

    public void contarTarefasRestantes() {
        int i;
        for (i = 0; i < tarefas.size(); i++) {
            if (tarefas.get(i).isConcluida()) {
                totalConcluidas++;
            }
        }
    }

    public void relatorio() {
        float percentual = totalConcluidas / tarefas.size();
        System.out.println("Percentual de progresso das tarefas: " + percentual + "\n Tarefas restantes:");
        for (int i = 0; i < tarefas.size(); i++) {
        }

    }*/
}