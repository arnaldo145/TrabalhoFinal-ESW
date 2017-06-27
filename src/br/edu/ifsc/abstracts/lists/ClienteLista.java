/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.abstracts.lists;

import br.edu.ifsc.abstracts.AbstractLista;
import br.edu.ifsc.model.Cliente;
import interfaces.IItemLista;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vitor
 */
public class ClienteLista extends AbstractLista{

    public ClienteLista() {
    }
    

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
    
    public Cliente getCliente(int index){
        return ((Cliente) this.lista.get(index));
    }
    
    public List<Cliente> getAll(){
        List<Cliente> clienteLista = new ArrayList<>();
        for(IItemLista cliente : this.lista){
            clienteLista.add(((Cliente)cliente));
        }
        return clienteLista;
    }
   
    
    
}
