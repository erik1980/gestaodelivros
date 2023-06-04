/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.unicv.gestaodelivros.controllers;

import com.unicv.gestaodelivros.model.Livro;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author erik
 */
public class ListarLivrosViewController implements Initializable {

    private final ObservableList<Livro> listaLivros = FXCollections.observableArrayList();

    @FXML
    private TableView<Livro> tblListaPessoas;

    @FXML
    private TableColumn<Livro, String> tituloColumn;

    @FXML
    private TableColumn<Livro, String> autorColumn;

    @FXML
    private TableColumn<Livro, String> isbnColumn;

    @FXML
    private TableColumn<Livro, Integer> paginasColumn;

    @FXML
    private TableColumn<Livro, Integer> copiasColumn;

    public void onActionAdicionar() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/AdicionarLivroView.fxml"));
        Parent root = loader.load();
        AdicionarLivroViewController controller = loader.getController();
        controller.setListaLivros(listaLivros);
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("Adicionar um livro");
        stage.setScene(scene);
        stage.showAndWait();
    }

    public void onActionExcluir() {
        ObservableList<Livro> listaSelecionada = tblListaPessoas.getSelectionModel().getSelectedItems();
        listaLivros.removeAll(listaSelecionada);
//        Livro livroSelecionado = tblListaPessoas.getSelectionModel().getSelectedItem();
//        listaLivros.remove(livroSelecionado);    

    }

    public void onActionAtualizar() throws IOException {
        if (tblListaPessoas.getSelectionModel().getSelectedItems().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING, "Selecione o livro que deseja atualizar", ButtonType.OK);
            alert.showAndWait();
        } else {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/AtualizarLivroView.fxml"));
            Parent root = loader.load();
            AtualizarLivroViewController controller = loader.getController();
            Livro livro = tblListaPessoas.getSelectionModel().getSelectedItem();
            controller.setLivro(livro);
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setTitle("Atualizar um livro");
            stage.setScene(scene);
            stage.showAndWait();
        }
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        populateListaPessoas();
        tituloColumn.setCellValueFactory(new PropertyValueFactory<>("titulo"));
        autorColumn.setCellValueFactory(new PropertyValueFactory<>("autor"));
        isbnColumn.setCellValueFactory(new PropertyValueFactory<>("ISBN"));
        paginasColumn.setCellValueFactory(new PropertyValueFactory<>("numeroPaginas"));
        copiasColumn.setCellValueFactory(new PropertyValueFactory<>("numeroCopias"));
        tblListaPessoas.setItems(listaLivros);
        tblListaPessoas.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

    }

    private void populateListaPessoas() {
        listaLivros.add(new Livro("Introdução à Programação", "Marcelo Costa", "1232345663", 103, 10));
        listaLivros.add(new Livro("Programação Orientada por Objetos", "Rolando Fernandes", "2349829192", 223, 50));
        listaLivros.add(new Livro("Matemáticas I", "Nilson Martins", "199494493", 346, 42));
        listaLivros.add(new Livro("Introdução Base de Dados", "Celestino Barros", "193939484", 235, 23));
        listaLivros.add(new Livro("Redes de Computadores", "João Rodrigues", "13994852", 531, 12));

    }

}
