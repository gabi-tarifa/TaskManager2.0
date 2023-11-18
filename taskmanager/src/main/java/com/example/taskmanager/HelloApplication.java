package com.example.taskmanager;

import com.example.taskmanager.model.Disciplina;
import com.example.taskmanager.util.HibernateUtil;
import javafx.application.Application;
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

    @Override
    public void start(Stage stageInitial) throws IOException {
        stage = stageInitial;
        FXMLLoader telaLogin = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        FXMLLoader telaCadastro = new FXMLLoader(HelloApplication.class.getResource("cadastro.fxml"));
        FXMLLoader telaInicial = new FXMLLoader(HelloApplication.class.getResource("telaInicial.fxml"));
        FXMLLoader telaCriarTarefa = new FXMLLoader(HelloApplication.class.getResource("telaCriarTarefa.fxml"));
        sceneLogin = new Scene(telaLogin.load());
        sceneCadastro = new Scene(telaCadastro.load());
        sceneTelaInicial = new Scene(telaInicial.load());
        sceneCriarTarefa = new Scene(telaCriarTarefa.load());
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
            case "completarTarefa":
            case "ajuda":
            case "telaDisciplinaArq":
            case "telaDisciplinaBio":
            case "telaDisciplinaCom":
            case "telaDisciplinaCon":
            case "telaDisciplinaEle":
            case "telaDisciplinaFil":
            case "telaDisciplinaFis":
            case "telaDisciplinaGeo":
            case "telaDisciplinaHis":
            case "telaDisciplinaJog":
            case "telaDisciplinaLex":
            case "telaDisciplinaMat":
            case "telaDisciplinaMec":
            case "telaDisciplinaPdt":
            case "telaDisciplinaPor":
            case "telaDisciplinaQui":
            case "telaDisciplinaSoc":
            case "telaDisciplinaTel":
        }
    }

    public static void main(String[] args) {
        launch();
    }
}