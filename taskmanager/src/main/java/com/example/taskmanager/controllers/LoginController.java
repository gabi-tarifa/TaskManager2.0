package com.example.taskmanager.controllers;

import com.example.taskmanager.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private Button btCadastrar;

    @FXML
    private Button btEntrar;

    @FXML
    private TextField txMatricula;

    @FXML
    private PasswordField txSenha;

    @FXML
    void useBtCadastrar(ActionEvent event){
        HelloApplication.altercateTells("cadastro");
    }

    @FXML
    void useBtEntrar(ActionEvent event){
        HelloApplication.altercateTells("telaInicial");
    }

}
