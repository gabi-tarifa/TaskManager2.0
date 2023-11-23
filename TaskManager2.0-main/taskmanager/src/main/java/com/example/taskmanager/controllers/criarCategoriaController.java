package com.example.taskmanager.controllers;

import com.example.taskmanager.HelloApplication;
import com.example.taskmanager.model.Categoria;
import com.example.taskmanager.model.Usuario;
import com.example.taskmanager.util.HibernateUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class criarCategoriaController {
    @FXML
    private Button btCriarCategoria;
    @FXML
    private TextField txtCodigo;
    @FXML
    private TextField txtNome;
    @FXML
    void useBtCriarCategoria(ActionEvent event) {
        String nome = txtNome.getText();
        String codigo = txtCodigo.getText();
        Categoria categoria = new Categoria(nome, codigo);
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(categoria);
        transaction.commit();
        session.close();
        txtCodigo.setText("");
        txtNome.setText("");
        HelloApplication.altercateTells("telaCriarTarefa");
    }

}
