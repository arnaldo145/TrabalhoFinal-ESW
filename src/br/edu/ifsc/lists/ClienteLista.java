/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.lists;

import br.edu.ifsc.abstracts.AbstractLista;
import br.edu.ifsc.model.Cliente;
import java.util.List;

/**
 *
 * @author Vitor
 */
public class ClienteLista extends AbstractLista<Cliente>{

    public ClienteLista() {
    }
    

    @Override
    public boolean add(Cliente item) {
        return this.lista.add(item);
    }

    @Override
    public boolean remove(Cliente item) {
        return this.lista.remove(item);
    }

    @Override
    public boolean update(Cliente novoItem, int index) {
       boolean resultado = false;

        if (lista.get(index) != null) {
            this.lista.add(index, novoItem);
            resultado = true;
        }

        return resultado;
    }
    
    @Override
    public Cliente get(int index){
        return this.lista.get(index);
    }

  
    
    
}
