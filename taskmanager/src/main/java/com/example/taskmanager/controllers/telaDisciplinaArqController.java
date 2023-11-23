package com.example.taskmanager.controllers;

import com.example.taskmanager.model.Tarefa;
import com.example.taskmanager.util.HibernateUtil;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.net.URL;
import java.util.List;
import java.util.Collections;
import java.util.ResourceBundle;

public class telaDisciplinaArqController implements Initializable {

    @FXML
    private ListView<Tarefa> listaAtividades;
    Session session = HibernateUtil.getSessionFactory().openSession();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        List<Tarefa> tarefas = (List<Tarefa>) session.createQuery("from Tarefa", Tarefa.class).getResultList();
        session.getTransaction().commit();
        session.close();
        listaAtividades.getItems().addAll(tarefas);
    }
}
