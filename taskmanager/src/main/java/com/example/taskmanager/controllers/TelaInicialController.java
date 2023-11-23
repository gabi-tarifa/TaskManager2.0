package com.example.taskmanager.controllers;

import com.example.taskmanager.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;

public class TelaInicialController {


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
        HelloApplication.altercateTells("telaDisciplinaArq");
    }

}
