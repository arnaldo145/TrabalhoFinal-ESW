/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.model;

import br.edu.ifsc.abstracts.AbstractOperacaoFinanceira;
import br.edu.ifsc.lists.ItemOperacaoFinanceiraLista;

/**
 *
 * @author Vitor
 */
public class Venda extends AbstractOperacaoFinanceira{
    private double desconto;

    public Venda(Cliente cliente, ItemOperacaoFinanceiraLista listaRacao) {
        super(cliente, listaRacao);
        this.desconto = 0;
    }

    public Venda(double desconto) {
        this.desconto = desconto;
    }
    

    public Venda(double desconto, Cliente cliente, ItemOperacaoFinanceiraLista listaRacao) {
        super(cliente, listaRacao);
        this.desconto = desconto;
    }

    @Override
    public double realizarOperacao() {
        if(this.pessoaFisica == null){
            throw new NullPointerException("Não há um CLiente associado a esta Venda!");
        }
        return super.realizarOperacao();
    }
    
    
    
    public double realizarOperacao(double desconto) {
        this.desconto = desconto;
        double valorFinal = this.realizarOperacao();
        valorFinal -=  valorFinal * (this.desconto/100);
        return valorFinal;
    }

    /**
     * @return the desconto
     */
    public double getDesconto() {
        return desconto;
    }

    /**
     * @param desconto the desconto to set
     */
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        String texto = super.toString() + "\n"
                + "Valor Final: " + this.realizarOperacao() + "\n";
        if(this.desconto > 0){
            texto += "Desocnto: " + this.desconto + "%\n"
                    + "Valor Final com Desconto: " + this.realizarOperacao(this.desconto) + "\n";
        }
        return texto;
    }

    
    
    
    
    
    
    
}
