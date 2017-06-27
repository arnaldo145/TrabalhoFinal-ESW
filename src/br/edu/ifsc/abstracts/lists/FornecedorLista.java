/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.abstracts.lists;

import br.edu.ifsc.abstracts.AbstractLista;
import br.edu.ifsc.model.Fornecedor;
import interfaces.IItemLista;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Vitor
 */
public class FornecedorLista extends AbstractLista{

    @Override
    public boolean add(IItemLista item) {
       return this.lista.add(item);
    }

    @Override
    public boolean remove(IItemLista item) {
        return this.lista.remove(item);
    }

    @Override
    public void upadate(IItemLista novoItem, int index) {
        this.lista.add(index, novoItem);
    }
    
    public Fornecedor get(int index){
        return ((Fornecedor)this.lista.get(index));
    }
    
    public List<Fornecedor> getAll(){
        List<Fornecedor> fornecedorLista = new ArrayList<>();
        for(IItemLista fornecedor : this.lista){
            fornecedorLista.add(((Fornecedor)fornecedor));
        }
        return fornecedorLista;
    }
    
}
