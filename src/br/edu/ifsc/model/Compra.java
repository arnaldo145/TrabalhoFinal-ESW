/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.model;

import br.edu.ifsc.abstracts.AbstractOperacaoFinanceira;
import br.edu.ifsc.abstracts.AbstractPessoaFisica;
import br.edu.ifsc.lists.ItemOperacaoFinanceiraLista;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Vitor
 */
public class Compra extends AbstractOperacaoFinanceira{
    
    private int parcelas;

    public Compra() {
    }

    public Compra(Fornecedor fornecedor, ItemOperacaoFinanceiraLista listaRacao) {
        super(fornecedor, listaRacao);
    }
    
    public Compra(int parcelas, Fornecedor fornecedor, ItemOperacaoFinanceiraLista listaRacao) {
        super(fornecedor, listaRacao);
        this.parcelas = parcelas;
    }

    @Override
    public double realizarOperacao() {
        if(this.pessoaFisica == null){
            throw new NullPointerException("Não há um Fornecedor associado a esta Compra!");
        }
        return super.realizarOperacao();
    }
    
    
    
    public double realizarOperacao(int parcelas) {
        this.parcelas = parcelas;
        return this.realizarOperacao() / this.parcelas;
    }

    /**
     * @return the parcelas
     */
    public int getParcelas() {
        return parcelas;
    }

    /**
     * @param parcelas the parcelas to set
     */
    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    @Override
    public String toString() {
        String texto = super.toString() + "\n"
                + "Valor Final: " + this.realizarOperacao() + "\n";
        if(this.parcelas > 0){
            texto += "Parcelas: " + this.parcelas + "%\n"
                    + "Valor de cada Parcela: " + this.realizarOperacao(this.parcelas) + "\n";
        }
        return texto;
    }
    
    
}
