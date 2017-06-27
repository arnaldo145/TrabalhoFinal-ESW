/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.abstracts;

import interfaces.IItemLista;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vitor
 */
public abstract class AbstractLista {
    protected List<IItemLista> lista;

    public AbstractLista() {
        this.lista = new ArrayList<>();
    }

    public AbstractLista(List<IItemLista> lista) {
        this.lista = lista;
    }

    /**
     * @return the lista
     */
    public List<IItemLista> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(List<IItemLista> lista) {
        this.lista = lista;
    }
    
    public abstract boolean add(IItemLista item);
    public abstract boolean remove(IItemLista item);
    public abstract void upadate(IItemLista novoItem, int index);
}
