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
    private static Scene sceneCriarCategoria;

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
        FXMLLoader criarCategoria = new FXMLLoader(HelloApplication.class.getResource("telaCriarCategoria.fxml"));
        sceneLogin = new Scene(telaLogin.load());
        sceneCadastro = new Scene(telaCadastro.load());
        sceneTelaInicial = new Scene(telaInicial.load());
        sceneCriarTarefa = new Scene(telaCriarTarefa.load());
        sceneRemoverTarefa = new Scene(telaRemoverTarefa.load());
        sceneCompletarTarefa = new Scene(telaCompletarTarefa.load());
        sceneAjuda = new Scene(telaAjuda.load());
        sceneCriarCategoria = new Scene(criarCategoria.load());
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
            case "criarCategoria":
                stage.setTitle("Criar Categoria");
                stage.setScene(sceneCriarCategoria);
                break;
        }
    }

    public static void main(String[] args) {
        launch();
    }
}