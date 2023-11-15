package com.example.taskmanager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage stage;
    private static Scene sceneLogin;
    private static Scene sceneCadastro;
    private static Scene sceneTelaInicial;

    @Override
    public void start(Stage stageInitial) throws IOException {
        stage = stageInitial;
        FXMLLoader telaLogin = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        FXMLLoader telaCadastro = new FXMLLoader(HelloApplication.class.getResource("cadastro.fxml"));
        FXMLLoader telaInicial = new FXMLLoader(HelloApplication.class.getResource("telaInicial.fxml"));
        sceneLogin = new Scene(telaLogin.load());
        sceneCadastro = new Scene(telaCadastro.load());
        sceneTelaInicial = new Scene(telaInicial.load());
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
        }
    }

    public static void main(String[] args) {
        launch();
    }
}