/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.unicv.gestaodelivros.controllers;

import com.unicv.gestaodelivros.model.Livro;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author erik
 */
public class AdicionarLivroViewController implements Initializable {

    private ObservableList<Livro> listaLivros;

    @FXML
    private TextField txtTitulo;

    @FXML
    private TextField txtAutor;

    @FXML
    private TextField txtISBN;

    @FXML
    private TextField txtPaginas;

    @FXML
    private TextField txtCopias;

    public void setListaLivros(ObservableList<Livro> listaLivros) {
        this.listaLivros = listaLivros;
    }

    public void onActionAceitar(ActionEvent event) {
        Livro livro = new Livro();
        livro.setTitulo(txtTitulo.getText());
        livro.setAutor(txtAutor.getText());
        livro.setISBN(txtISBN.getText());
        livro.setNumeroCopias(Integer.parseInt(txtCopias.getText()));
        livro.setNumeroPaginas(Integer.parseInt(txtPaginas.getText()));
        listaLivros.add(livro);
//        Node source = (Node)event.getSource();
//        Scene scene = source.getScene();
//        Stage stage = (Stage)scene.getWindow();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();

    }

    public void onActionCancelar(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
