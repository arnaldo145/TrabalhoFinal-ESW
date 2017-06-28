/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.abstracts;

import br.edu.ifsc.lists.ItemOperacaoFinanceiraLista;
import br.edu.ifsc.model.ItemOperacaoFinanceira;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Vitor
 */
public abstract class AbstractOperacaoFinanceira {
    protected Date data;
    protected AbstractPessoaFisica pessoaFisica;
    protected ItemOperacaoFinanceiraLista listaRacao;

    public AbstractOperacaoFinanceira() {
        this.data = new Date();
        this.listaRacao = new ItemOperacaoFinanceiraLista();
    }

    public AbstractOperacaoFinanceira(AbstractPessoaFisica pessoaFisica, ItemOperacaoFinanceiraLista listaRacao) {
        this.data = new Date();
        this.pessoaFisica = pessoaFisica;
        this.listaRacao = listaRacao;
    }

    

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the pessoaFisica
     */
    public AbstractPessoaFisica getPessoaFisica() {
        return pessoaFisica;
    }

    /**
     * @param pessoaFisica the pessoaFisica to set
     */
    public void setPessoaFisica(AbstractPessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    /**
     * @return the listaRacao
     */
    public ItemOperacaoFinanceiraLista getListaRacao() {
        return listaRacao;
    }

    /**
     * @param listaRacao the listaRacao to set
     */
    public void setListaRacao(ItemOperacaoFinanceiraLista listaRacao) {
        this.listaRacao = listaRacao;
    }
    
    public double realizarOperacao(){
        double valorFinal = 0;
        if(this.listaRacao == null || this.listaRacao.getLista().isEmpty()){
            throw new Error("A lista de Ração está Vazia!");
        }
        for (ItemOperacaoFinanceira itemOperacaoFinanceira : this.listaRacao.getLista()) {
            valorFinal += itemOperacaoFinanceira.calcularValor();
        }
        return valorFinal;
    }
    
    @Override
    public String toString(){
        String texto = "Data: " + this.data.toString() + "\n"
                + "Pessoa Física: " + this.pessoaFisica.toString() + "\n\n"
                + "Lista de Rações Encomendadas:\n\n";
        for (ItemOperacaoFinanceira itemOperacaoFinanceira : this.listaRacao.getLista()) {
            texto += itemOperacaoFinanceira.toString() + "\n\n";
        }
        return texto;
    }
}
