package com.example.taskmanager.controllers;

import com.example.taskmanager.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;

public class TelaInicialController {

    @FXML
    private MenuItem btCompleteTarefa;

    @FXML
    private MenuItem btCriarTarefa;

    @FXML
    private MenuItem btRemoverTarefa;

    @FXML
    private MenuItem btSair;

    @FXML
    private Label lblNomePerfil;

    @FXML
    void useBtRemoverTarefa(ActionEvent event) {

    }

    @FXML
    void useBtCompleteTarefa(ActionEvent event) {

    }

    @FXML
    void useBtCriarTarefa(ActionEvent event) {

    }

    @FXML
    void useBtSair(ActionEvent event) {
        HelloApplication.altercateTells("login");
    }

}
