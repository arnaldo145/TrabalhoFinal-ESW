/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.abstracts;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vitor
 */
public abstract class AbstractLista<T> {
    protected List<T> lista;

    public AbstractLista() {
        this.lista = new ArrayList<>();
    }

    public AbstractLista(List<T> lista) {
        this.lista = lista;
    }

    /**
     * @return the lista
     */
    public List<T> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(List<T> lista) {
        this.lista = lista;
    }
    
    public abstract boolean add(T item);
    public abstract boolean remove(T item);
    public abstract boolean update(T novoItem, int index);
    public abstract T get(int index);
}
