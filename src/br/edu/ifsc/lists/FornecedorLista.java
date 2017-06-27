/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.lists;

import br.edu.ifsc.abstracts.AbstractLista;
import br.edu.ifsc.model.Fornecedor;


/**
 *
 * @author Vitor
 */
public class FornecedorLista extends AbstractLista<Fornecedor>{

    @Override
    public boolean add(Fornecedor item) {
       return this.lista.add(item);
    }

    @Override
    public boolean remove(Fornecedor item) {
        return this.lista.remove(item);
    }

    @Override
    public void upadate(Fornecedor novoItem, int index) {
        this.lista.add(index, novoItem);
    }
    
    @Override
    public Fornecedor get(int index){
        return ((Fornecedor)this.lista.get(index));
    }
    
  
    
}
