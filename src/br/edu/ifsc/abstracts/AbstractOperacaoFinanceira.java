/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.abstracts;

import br.edu.ifsc.model.ItemOperacaoFinanceira;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Vitor
 */
public abstract class AbstractOperacaoFinanceira {
    protected Date data;
    protected AbstractPessoaFisica pessoaFisica;
    protected List<ItemOperacaoFinanceira> listaRacao;

    public AbstractOperacaoFinanceira() {
        this.data = new Date();
        this.listaRacao = new ArrayList<>();
    }

    public AbstractOperacaoFinanceira(AbstractPessoaFisica pessoaFisica, List<ItemOperacaoFinanceira> listaRacao) {
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
    public List<ItemOperacaoFinanceira> getListaRacao() {
        return listaRacao;
    }

    /**
     * @param listaRacao the listaRacao to set
     */
    public void setListaRacao(List<ItemOperacaoFinanceira> listaRacao) {
        this.listaRacao = listaRacao;
    }
    
    public double realizarOperacao(){
        double valorFinal = 0;
        for (ItemOperacaoFinanceira itemOperacaoFinanceira : this.listaRacao) {
            valorFinal += itemOperacaoFinanceira.calcularValor();
        }
        return valorFinal;
    }
    
    @Override
    public String toString(){
        String texto = "Data: " + this.data.toString() + "\n"
                + "Pessoa Física: " + this.pessoaFisica.toString() + "\n\n"
                + "Lista de Rações Encomendadas:\n\n";
        for (ItemOperacaoFinanceira itemOperacaoFinanceira : this.listaRacao) {
            texto += itemOperacaoFinanceira.toString() + "\n\n";
        }
        return texto;
    }
}
