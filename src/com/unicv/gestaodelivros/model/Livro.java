/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unicv.gestaodelivros.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author erik
 */
public class Livro {

    private final StringProperty titulo = new SimpleStringProperty(this, "titulo");
    private final StringProperty autor = new SimpleStringProperty(this, "titulo");
    private final StringProperty ISBN = new SimpleStringProperty(this, "titulo");
    private final IntegerProperty numeroPaginas = new SimpleIntegerProperty(this, "numeroPaginas", 0);
    private final IntegerProperty numeroCopias = new SimpleIntegerProperty(this, "numeroCopias", 0);

    public Livro(String titulo, String autor, String ISBN, int numeroPaginas, int numeroCopias) {
        this.titulo.set(titulo);
        this.autor.set(autor);
        this.ISBN.set(ISBN);
        this.numeroPaginas.set(numeroPaginas);
        this.numeroCopias.set(numeroCopias);
    }

    public Livro() {
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo.get();
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo.set(titulo);
    }

    public StringProperty tituloProperty() {
        return titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor.get();
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor.set(autor);
    }

    public StringProperty autorProperty() {
        return autor;
    }

    /**
     * @return the ISBN
     */
    public String getISBN() {
        return ISBN.get();
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setISBN(String ISBN) {
        this.ISBN.set(ISBN);
    }

    public final StringProperty ISBNProperty() {
        return ISBN;
    }

    /**
     * @return the numeroPaginas
     */
    public int getNumeroPaginas() {
        return numeroPaginas.get();
    }

    /**
     * @param numeroPaginas the numeroPaginas to set
     */
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas.set(numeroPaginas);
    }

    public final IntegerProperty numeroPaginasProperty() {
        return numeroPaginas;
    }

    public int getNumeroCopias() {
        return numeroCopias.get();
    }

    /**
     * @param numeroCopias the numeroCopias to set
     */
    public void setNumeroCopias(int numeroCopias) {
        this.numeroCopias.set(numeroCopias);
    }

    public final IntegerProperty numeroCopiasProperty() {
        return numeroCopias;
    }

}
