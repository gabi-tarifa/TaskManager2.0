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
    private Label lblMatrSenIncorretos;

    @FXML
    void useBtCadastrar(ActionEvent event){
            HelloApplication.altercateTells("cadastro");
    }

    protected boolean login() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            Usuario usuario = session.createQuery("from Usuario where matricula = :matricula and senha = :senha", Usuario.class)
                    .setParameter("matricula", txMatricula.getText().toLowerCase())
                    .setParameter("senha", txSenha.getText()).uniqueResult();
            if (usuario == null) {
                lblMatrSenIncorretos.setText("Matricula ou senha incorretos");
                return false;
            }
            session.getTransaction().commit();
        } catch (Exception e){
            if (session.getTransaction()!=null)
                session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return true;
    }

    @FXML
    void useBtEntrar(ActionEvent event){
        if(login()) {
            lblMatrSenIncorretos.setText("");
            txMatricula.setText("");
            txSenha.setText("");
            HelloApplication.altercateTells("telaInicial");
        }
    }

}
