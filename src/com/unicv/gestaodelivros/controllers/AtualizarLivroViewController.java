/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.unicv.gestaodelivros.controllers;

import com.unicv.gestaodelivros.model.Livro;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author erik
 */
public class AtualizarLivroViewController implements Initializable {

    private Livro livro;

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
    
        /**
     * @param livro the livro to set
     */
    public void setLivro(Livro livro) {
        this.livro = livro;
        txtTitulo.setText(livro.getTitulo());
        txtAutor.setText(livro.getAutor());
        txtISBN.setText(livro.getISBN());
        txtCopias.setText(Integer.toString(livro.getNumeroCopias()));
        txtPaginas.setText(Integer.toString(livro.getNumeroPaginas()));
    }

    public void onActionAceitar(ActionEvent event) {
        livro.setTitulo(txtTitulo.getText());
        livro.setAutor(txtAutor.getText());
        livro.setISBN(txtISBN.getText());
        livro.setNumeroPaginas(Integer.parseInt(txtPaginas.getText()));
        livro.setNumeroCopias(Integer.parseInt(txtCopias.getText()));
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

    }

}
