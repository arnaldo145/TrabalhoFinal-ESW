/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.abstracts.lists;

import br.edu.ifsc.abstracts.AbstractLista;
import br.edu.ifsc.enums.EnumEspecie;
import br.edu.ifsc.enums.EnumPorte;
import br.edu.ifsc.enums.EnumTipo;
import br.edu.ifsc.model.Racao;
import interfaces.IItemLista;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vitor
 */
public class RacaoLista extends AbstractLista{
    

    public RacaoLista() {
    }
    
    
    /**
     * @return the listaRacao
     */
    public List<IItemLista> getListaRacao() {
        return this.lista;
    }

    /**
     * @param listaRacao the listaRacao to set
     */
    public void setListaRacao(List<IItemLista> listaRacao) {
        this.lista = listaRacao;
    }

    /**
     *
     * @param racao
     * @return
     */
    @Override
    public boolean add(IItemLista racao){
        return this.lista.add(racao);
    }
    
    /**
     *
     * @param racao
     * @return
     */
    @Override
    public boolean remove(IItemLista racao){
        return this.lista.remove(racao);
    }
    
    /**
     *
     * @param novaRacao
     * @param index
     */
    @Override
    public void upadate(IItemLista novaRacao, int index){
        this.lista.add(index, novaRacao);
    }
    
    public List<Racao> getByEspecie(EnumEspecie especie){
        List<Racao> racaoEspecie = new ArrayList<>();
        for(IItemLista racao: this.lista){
            if(((Racao)racao).getEspecie().equals(especie)){
                racaoEspecie.add(((Racao)racao));
            }
        }
        return racaoEspecie;
    }
    
    public List<Racao> getByPorte(EnumPorte porte){
        List<Racao> racaoPorte = new ArrayList<>();
        for(IItemLista racao: this.lista){
            if(((Racao)racao).getPorte().equals(porte)){
                racaoPorte.add(((Racao)racao));
            }
        }
        return racaoPorte;
    }
    
    public List<Racao> getByTipo(EnumTipo tipo){
        List<Racao> racaoTipo = new ArrayList<>();
        for(IItemLista racao: this.lista){
            if(((Racao)racao).getTipo().equals(tipo)){
                racaoTipo.add(((Racao)racao));
            }
        }
        return racaoTipo;
    }
    
    public Racao get(int index){
        return ((Racao)this.lista.get(index));
    }
    
    public List<Racao> getAll(){
        List<Racao> listaRacao = new ArrayList<>();
        for(IItemLista racao : this.lista){
            listaRacao.add(((Racao)racao));
        }
        return listaRacao;
    }

    
}
