/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.lists;

import br.edu.ifsc.abstracts.AbstractLista;
import br.edu.ifsc.enums.EnumEspecie;
import br.edu.ifsc.enums.EnumPorte;
import br.edu.ifsc.enums.EnumTipo;
import br.edu.ifsc.model.Racao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vitor
 */
public class RacaoLista extends AbstractLista<Racao>{
    

    public RacaoLista() {
    }
    
   
    /**
     *
     * @param racao
     * @return
     */
    @Override
    public boolean add(Racao racao){
        return this.lista.add(racao);
    }
    
    /**
     *
     * @param racao
     * @return
     */
    @Override
    public boolean remove(Racao racao){
        return this.lista.remove(racao);
    }
    
    /**
     *
     * @param novaRacao
     * @param index
     */
    @Override
    public void upadate(Racao novaRacao, int index){
        this.lista.add(index, novaRacao);
    }
    
    public List<Racao> getByEspecie(EnumEspecie especie){
        List<Racao> racaoEspecie = new ArrayList<>();
        for(Racao racao: this.lista){
            if(racao.getEspecie().equals(especie)){
                racaoEspecie.add(racao);
            }
        }
        return racaoEspecie;
    }
    
    public List<Racao> getByPorte(EnumPorte porte){
        List<Racao> racaoPorte = new ArrayList<>();
        for(Racao racao: this.lista){
            if(racao.getPorte().equals(porte)){
                racaoPorte.add(racao);
            }
        }
        return racaoPorte;
    }
    
    public List<Racao> getByTipo(EnumTipo tipo){
        List<Racao> racaoTipo = new ArrayList<>();
        for(Racao racao: this.lista){
            if(racao.getTipo().equals(tipo)){
                racaoTipo.add(racao);
            }
        }
        return racaoTipo;
    }
    
    @Override
    public Racao get(int index){
        return this.lista.get(index);
    }

    
}
