package com.example.taskmanager.controllers;

import com.example.taskmanager.HelloApplication;
import com.example.taskmanager.model.Categoria;
import com.example.taskmanager.model.Disciplina;
import com.example.taskmanager.model.Tarefa;
import com.example.taskmanager.model.Usuario;
import com.example.taskmanager.util.HibernateUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Date;

public class CriarTarefaController {

    public ToggleGroup disciplinas;
    @FXML
    private Button btCriarCategoria;

    @FXML
    private Button btCriarTarefa;

    @FXML
    private RadioButton rdARQ;

    @FXML
    private RadioButton rdBIO;

    @FXML
    private RadioButton rdCOM;

    @FXML
    private RadioButton rdCON;

    @FXML
    private RadioButton rdELE;

    @FXML
    private RadioButton rdFIL;

    @FXML
    private RadioButton rdFIS;

    @FXML
    private RadioButton rdGEO;

    @FXML
    private RadioButton rdHIS;

    @FXML
    private RadioButton rdImportante;

    @FXML
    private RadioButton rdJOG;

    @FXML
    private RadioButton rdLEX;

    @FXML
    private RadioButton rdMAT;

    @FXML
    private RadioButton rdMEC;

    @FXML
    private RadioButton rdPDT;

    @FXML
    private RadioButton rdPOR;

    @FXML
    private RadioButton rdQUI;

    @FXML
    private RadioButton rdSOC;

    @FXML
    private RadioButton rdTEL;

    @FXML
    private RadioButton rdUrgente;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtCategoria;

    private String nome;
    private String nomecategoria;
    private int iddisciplina;
    private boolean importante, urgente;

    @FXML
    private Label txtCat404;

    @FXML
    private Label txtDis404;

    private Disciplina disciplina;
    private Categoria categoria;

    @FXML
    void crairTarefa(ActionEvent event) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        nome = txtNome.getText();
        nomecategoria = txtCategoria.getText().toLowerCase();
        categoria = session.createQuery("from Categoria where nome = :nomecategoria", Categoria.class).setParameter("nomecategoria", nomecategoria).getSingleResult();
        if(disciplinaFind() && categoriaFind()){
            txtCat404.setText("");
            txtDis404.setText("");
            txtNome.setText("");
            txtCategoria.setText("");
            Tarefa tarefa = new Tarefa(nome, categoria, disciplina, urgente, importante);
            HelloApplication.altercateTells("telaInicial");
            session.persist(tarefa);
            session.close();
        }

    }
    protected boolean disciplinaFind() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();

            disciplina = session.createQuery("from Disciplina where id = :iddisciplina", Disciplina.class).setParameter("iddisciplina", iddisciplina).getSingleResult();
            if (disciplina == null) {
                txtDis404.setText("Selecione uma disciplina");
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
    protected boolean categoriaFind() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            categoria = session.createQuery("from Categoria where nome = :nomecategoria", Categoria.class).setParameter("nomecategoria", nomecategoria).getSingleResult();
            if (categoria == null) {
                txtCat404.setText("Categoria não selecionada");
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
    void criarCategoria(ActionEvent event) {

    }

    @FXML
    void selectDisciplina(ActionEvent event){
        if (rdARQ.isSelected()){
            iddisciplina = 17;
        } else if (rdBIO.isSelected()){
            iddisciplina = 12;
        } else if (rdELE.isSelected()){
            iddisciplina = 14;
        } else if (rdCOM.isSelected()){
            iddisciplina = 3;
        } else if (rdCON.isSelected()){
            iddisciplina = 4;
        } else if (rdFIL.isSelected()){
            iddisciplina = 8;
        } else if (rdFIS.isSelected()){
            iddisciplina = 10;
        } else if (rdGEO.isSelected()){
            iddisciplina = 6;
        } else if (rdHIS.isSelected()){
            iddisciplina = 2;
        } else if (rdJOG.isSelected()){
            iddisciplina = 11;
        } else if (rdLEX.isSelected()){
            iddisciplina = 9;
        } else if (rdMAT.isSelected()){
            iddisciplina = 1;
        } else if (rdMEC.isSelected()){
            iddisciplina = 13;
        } else if (rdPDT.isSelected()){
            iddisciplina = 16;
        } else if (rdPOR.isSelected()){
            iddisciplina = 5;
        } else if (rdSOC.isSelected()){
            iddisciplina = 18;
        } else if (rdQUI.isSelected()){
            iddisciplina = 7;
        } else if (rdTEL.isSelected()){
            iddisciplina = 15;
        } else {
            iddisciplina = 0;
        }
    }
    @FXML
    void rdImportanteCheck(ActionEvent event) {
        if(rdImportante.isSelected()){
            importante = true;
        } else importante = false;
    }

    @FXML
    void rdUrgenteCheck(ActionEvent event) {
        if(rdUrgente.isSelected()){
            urgente = true;
        } else urgente = false;
    }
/*
    @FXML
    void rdARQCheck(ActionEvent event) {

    }

    @FXML
    void rdBIOCheck(ActionEvent event) {

    }

    @FXML
    void rdCOMCheck(ActionEvent event) {

    }

    @FXML
    void rdCONCheck(ActionEvent event) {

    }

    @FXML
    void rdELECheck(ActionEvent event) {
        if
    }

    @FXML
    void rdFILCheck(ActionEvent event) {

    }

    @FXML
    void rdFISCheck(ActionEvent event) {

    }

    @FXML
    void rdGEOCHECK(ActionEvent event) {

    }

    @FXML
    void rdHISCheck(ActionEvent event) {

    }

    @FXML
    void rdJOGCheck(ActionEvent event) {

    }

    @FXML
    void rdLEXCheck(ActionEvent event) {

    }

    @FXML
    void rdMATCheck(ActionEvent event) {

    }

    @FXML
    void rdMECCheck(ActionEvent event) {

    }

    @FXML
    void rdPDTCheck(ActionEvent event) {

    }

    @FXML
    void rdPORCheck(ActionEvent event) {

    }

    @FXML
    void rdQUICheck(ActionEvent event) {

    }

    @FXML
    void rdSOCCheck(ActionEvent event) {

    }

    @FXML
    void rdTELCheck(ActionEvent event) {

    }*/
}
