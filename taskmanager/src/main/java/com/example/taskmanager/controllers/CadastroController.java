package com.example.taskmanager.controllers;

import com.example.taskmanager.HelloApplication;
import com.example.taskmanager.model.Usuario;
import com.example.taskmanager.util.HibernateUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class CadastroController {

    @FXML
    private Button btCriarUsuario;

    @FXML
    private Label lblConfirmSenha;

    @FXML
    private PasswordField txtConfirmSenha;

    @FXML
    private TextField txtMatricula;

    @FXML
    private TextField txtNome;

    @FXML
    private PasswordField txtSenha;

    @FXML
    void  useBtCriarUsuario(ActionEvent event) {
        lblConfirmSenha.setText("");
        String confirmSenha = txtConfirmSenha.getText();
        String senha = txtSenha.getText();
        String nome = txtNome.getText();
        String matricula = txtMatricula.getText();
        if(confirmSenha.equals(senha)) {
            Usuario u = new Usuario(nome, matricula, senha);
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.persist(u);
            transaction.commit();
            session.close();
            txtConfirmSenha.setText("");
            txtSenha.setText("");
            txtMatricula.setText("");
            txtNome.setText("");
            HelloApplication.altercateTells("login");
        }else{
            lblConfirmSenha.setText("As senhas não conferem, tente novamente.");
        }
    }

}
