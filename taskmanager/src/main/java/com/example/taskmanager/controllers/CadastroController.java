package com.example.taskmanager.controllers;

import com.example.taskmanager.HelloApplication;
import com.example.taskmanager.model.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CadastroController {

    @FXML
    private Button btCriarUsuario;

    @FXML
    private Label lblConfirmSenha;

    @FXML
    private TextField txtConfirmSenha;

    @FXML
    private TextField txtMatricula;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtSenha;

    private String confirmSenha = "";
    private String senha = "";
    private String matricula = "";

    private String nome = "";

    @FXML
    void useBtCriarUsuario(ActionEvent event) {
        lblConfirmSenha.setText("");
        confirmSenha = txtConfirmSenha.getText();
        senha = txtSenha.getText();
        nome = txtNome.getText();
        matricula = txtMatricula.getText();
        if(confirmSenha.equals(senha)) {
            //Usuario u = new Usuario(nome, matricula, senha);
            HelloApplication.altercateTells("login");
        }else{
            lblConfirmSenha.setText("As senhas não conferem, tente novamente.");
        }
    }

}
