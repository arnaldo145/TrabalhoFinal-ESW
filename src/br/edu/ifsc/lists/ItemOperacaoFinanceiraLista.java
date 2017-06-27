/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.lists;

import br.edu.ifsc.abstracts.AbstractLista;
import br.edu.ifsc.model.ItemOperacaoFinanceira;

/**
 *
 * @author Aluno
 */
public class ItemOperacaoFinanceiraLista extends AbstractLista<ItemOperacaoFinanceira>{

    @Override
    public boolean add(ItemOperacaoFinanceira item) {
        return this.lista.add(item);
    }

    @Override
    public boolean remove(ItemOperacaoFinanceira item) {
        return this.lista.remove(item);
    }

    @Override
    public void upadate(ItemOperacaoFinanceira novoItem, int index) {
        this.lista.add(index, novoItem);
    }

    @Override
    public ItemOperacaoFinanceira get(int index) {
        return this.lista.get(index);
    }
    
}
