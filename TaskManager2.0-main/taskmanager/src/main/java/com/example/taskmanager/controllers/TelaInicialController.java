package com.example.taskmanager.controllers;

import com.example.taskmanager.HelloApplication;
import com.example.taskmanager.model.Tarefa;
import com.example.taskmanager.model.Usuario;
import com.example.taskmanager.util.HibernateUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import org.hibernate.Session;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class TelaInicialController implements Initializable {

    @FXML
    private ListView<Tarefa> listaAtividades;

    private List<Tarefa> tarefas = new ArrayList<>();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if (listagemTarefas()) {
            listaAtividades.getItems().addAll(tarefas);
        }
    }

    protected boolean listagemTarefas() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Tarefa> tarefas = (List<Tarefa>) session.createQuery("from Tarefa", Tarefa.class).getResultList();
        try {
            session.beginTransaction();
            if (tarefas == null) {
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

    public MenuItem btCriarTarefa;
    public MenuItem btSair;
    @FXML
    private Label lblNomePerfil;


    @FXML
    void useBtCriarTarefa(ActionEvent event) {
        HelloApplication.altercateTells("telaCriarTarefa");
    }

    @FXML
    void useBtSair(ActionEvent event) {
        HelloApplication.altercateTells("login");
    }

}
