package com.example.taskmanager;

import com.example.taskmanager.model.Categoria;
import com.example.taskmanager.model.Disciplina;
import com.example.taskmanager.util.HibernateUtil;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.named.FetchMemento;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage stage;
    private static Scene sceneLogin;
    private static Scene sceneCadastro;
    private static Scene sceneTelaInicial;
    private static Scene sceneCriarTarefa;
    private static Scene sceneRemoverTarefa;
    private static Scene sceneCompletarTarefa;
    private static Scene sceneAjuda;
    private static Scene sceneTarefaArq;
    private static Scene sceneTarefaBio;
    private static Scene sceneTarefaCom;
    private static Scene sceneTarefaCon;
    private static Scene sceneTarefaEle;
    private static Scene sceneTarefaFil;
    private static Scene sceneTarefaFis;
    private static Scene sceneTarefaGeo;
    private static Scene sceneTarefaHis;
    private static Scene sceneTarefaJog;
    private static Scene sceneTarefaLex;
    private static Scene sceneTarefaMat;
    private static Scene sceneTarefaMec;
    private static Scene sceneTarefaPdt;
    private static Scene sceneTarefaPor;
    private static Scene sceneTarefaQui;
    private static Scene sceneTarefaSoc;
    private static Scene sceneTarefaTel;

    @Override
    public void start(Stage stageInitial) throws IOException {
        stage = stageInitial;
        FXMLLoader telaLogin = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        FXMLLoader telaCadastro = new FXMLLoader(HelloApplication.class.getResource("cadastro.fxml"));
        FXMLLoader telaInicial = new FXMLLoader(HelloApplication.class.getResource("telaPrincipal.fxml"));
        FXMLLoader telaCriarTarefa = new FXMLLoader(HelloApplication.class.getResource("telaCriarTarefa.fxml"));
        FXMLLoader telaRemoverTarefa = new FXMLLoader(HelloApplication.class.getResource("telaRemoverTarefa.fxml"));
        FXMLLoader telaCompletarTarefa = new FXMLLoader(HelloApplication.class.getResource("telaCompletarTarefa.fxml"));
        FXMLLoader telaAjuda = new FXMLLoader(HelloApplication.class.getResource("ajuda.fxml"));
        FXMLLoader telaTarefasArq = new FXMLLoader(HelloApplication.class.getResource("tarefasArq.fxml"));
        FXMLLoader telaTarefasBio = new FXMLLoader(HelloApplication.class.getResource("tarefasBio.fxml"));
        FXMLLoader telaTarefasCom = new FXMLLoader(HelloApplication.class.getResource("tarefasCom.fxml"));
        FXMLLoader telaTarefasCon = new FXMLLoader(HelloApplication.class.getResource("tarefasCon.fxml"));
        FXMLLoader telaTarefasEle = new FXMLLoader(HelloApplication.class.getResource("tarefasEle.fxml"));
        FXMLLoader telaTarefasFil = new FXMLLoader(HelloApplication.class.getResource("tarefasFil.fxml"));
        FXMLLoader telaTarefasFis = new FXMLLoader(HelloApplication.class.getResource("tarefasFis.fxml"));
        FXMLLoader telaTarefasGeo = new FXMLLoader(HelloApplication.class.getResource("tarefasGeo.fxml"));
        FXMLLoader telaTarefasHis = new FXMLLoader(HelloApplication.class.getResource("tarefasHis.fxml"));
        FXMLLoader telaTarefasJog = new FXMLLoader(HelloApplication.class.getResource("tarefasJog.fxml"));
        FXMLLoader telaTarefasLex = new FXMLLoader(HelloApplication.class.getResource("tarefasLex.fxml"));
        FXMLLoader telaTarefasMat = new FXMLLoader(HelloApplication.class.getResource("tarefasMat.fxml"));
        FXMLLoader telaTarefasMec = new FXMLLoader(HelloApplication.class.getResource("tarefasMec.fxml"));
        FXMLLoader telaTarefasPdt = new FXMLLoader(HelloApplication.class.getResource("tarefasPdt.fxml"));
        FXMLLoader telaTarefasPor = new FXMLLoader(HelloApplication.class.getResource("tarefasPor.fxml"));
        FXMLLoader telaTarefasQui = new FXMLLoader(HelloApplication.class.getResource("tarefasQui.fxml"));
        FXMLLoader telaTarefasSoc = new FXMLLoader(HelloApplication.class.getResource("tarefasSoc.fxml"));
        FXMLLoader telaTarefasTel = new FXMLLoader(HelloApplication.class.getResource("tarefasTel.fxml"));
        sceneLogin = new Scene(telaLogin.load());
        sceneCadastro = new Scene(telaCadastro.load());
        sceneTelaInicial = new Scene(telaInicial.load());
        sceneCriarTarefa = new Scene(telaCriarTarefa.load());
        sceneRemoverTarefa = new Scene(telaRemoverTarefa.load());
        sceneCompletarTarefa = new Scene(telaCompletarTarefa.load());
        sceneAjuda = new Scene(telaAjuda.load());
        sceneTarefaArq = new Scene(telaTarefasArq.load());
        sceneTarefaBio = new Scene(telaTarefasBio.load());
        sceneTarefaCom = new Scene(telaTarefasCom.load());
        sceneTarefaCon = new Scene(telaTarefasCon.load());
        sceneTarefaEle = new Scene(telaTarefasEle.load());
        sceneTarefaFil = new Scene(telaTarefasFil.load());
        sceneTarefaFis = new Scene(telaTarefasFis.load());
        sceneTarefaGeo = new Scene(telaTarefasGeo.load());
        sceneTarefaHis = new Scene(telaTarefasHis.load());
        sceneTarefaJog = new Scene(telaTarefasJog.load());
        sceneTarefaLex = new Scene(telaTarefasLex.load());
        sceneTarefaMat = new Scene(telaTarefasMat.load());
        sceneTarefaMec = new Scene(telaTarefasMec.load());
        sceneTarefaPdt = new Scene(telaTarefasPdt.load());
        sceneTarefaPor = new Scene(telaTarefasPor.load());
        sceneTarefaQui = new Scene(telaTarefasQui.load());
        sceneTarefaSoc = new Scene(telaTarefasSoc.load());
        sceneTarefaTel = new Scene(telaTarefasTel.load());
        stage.setTitle("Login");
        stage.setScene(sceneLogin);
        stage.show();

    }

    public static void altercateTells(String tela){
        switch (tela){
            case "cadastro":
                stage.setScene(sceneCadastro);
                stage.setTitle("Cadastrar");
                break;
            case "login":
                stage.setTitle("Login");
                stage.setScene(sceneLogin);
                break;
            case "telaInicial":
                stage.setTitle("Tela Inicial");
                stage.setScene(sceneTelaInicial);
                break;
            case "telaCriarTarefa":
                stage.setTitle("Criar Nova Tarefa");
                stage.setScene(sceneCriarTarefa);
                break;
            case "removerTarefa":
                stage.setTitle("Remover Tarefa");
                stage.setScene(sceneRemoverTarefa);
                break;
            case "completarTarefa":
                stage.setTitle("Completar Tarefa");
                stage.setScene(sceneCompletarTarefa);
                break;
            case "ajuda":
                stage.setTitle("Ajuda");
                stage.setScene(sceneAjuda);
                break;
            case "telaDisciplinaArq":
                stage.setTitle("Tarefas de Arquitetura");
                stage.setScene(sceneTarefaArq);
                break;
            case "telaDisciplinaBio":
                stage.setTitle("Tarefas de Biologia");
                stage.setScene(sceneTarefaBio);
                break;
            case "telaDisciplinaCom":
                stage.setTitle("Tarefas de Computação");
                stage.setScene(sceneTarefaCom);
                break;
            case "telaDisciplinaCon":
                stage.setTitle("Tarefas de Construção");
                stage.setScene(sceneTarefaCon);
                break;
            case "telaDisciplinaEle":
                stage.setTitle("Tarefas de Eletrônica");
                stage.setScene(sceneTarefaEle);
                break;
            case "telaDisciplinaFil":
                stage.setTitle("Tarefas de Filosofia");
                stage.setScene(sceneTarefaFil);
                break;
            case "telaDisciplinaFis":
                stage.setTitle("Tarefas de Física");
                stage.setScene(sceneTarefaFis);
                break;
            case "telaDisciplinaGeo":
                stage.setTitle("Tarefas de Geografia");
                stage.setScene(sceneTarefaGeo);
                break;
            case "telaDisciplinaHis":
                stage.setTitle("Tarefas de História");
                stage.setScene(sceneTarefaHis);
                break;
            case "telaDisciplinaJog":
                stage.setTitle("Tarefas de Jogos");
                stage.setScene(sceneTarefaJog);
                break;
            case "telaDisciplinaLex":
                stage.setTitle("Tarefas de Línguas Extrangeiras");
                stage.setScene(sceneTarefaLex);
                break;
            case "telaDisciplinaMat":
                stage.setTitle("Tarefas de Matemática");
                stage.setScene(sceneTarefaMat);
                break;
            case "telaDisciplinaMec":
                stage.setTitle("Tarefas de Mecnica");
                stage.setScene(sceneTarefaMec);
                break;
            case "telaDisciplinaPdt":
                stage.setTitle("Tarefas de Produção de Texto");
                stage.setScene(sceneTarefaPdt);
                break;
            case "telaDisciplinaPor":
                stage.setTitle("Tarefas de Língua Portuguesa");
                stage.setScene(sceneTarefaPor);
                break;
            case "telaDisciplinaQui":
                stage.setTitle("Tarefas de Química");
                stage.setScene(sceneTarefaQui);
                break;
            case "telaDisciplinaSoc":
                stage.setTitle("Tarefas de Sociologia");
                stage.setScene(sceneTarefaSoc);
                break;
            case "telaDisciplinaTel":
                stage.setTitle("Tarefas de Telecomunicações");
                stage.setScene(sceneTarefaTel);
                break;
        }
    }

    public static void main(String[] args) {
        launch();
    }
}