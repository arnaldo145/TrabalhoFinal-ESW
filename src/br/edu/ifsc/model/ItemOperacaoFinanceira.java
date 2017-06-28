/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.model;

/**
 *
 * @author Vitor
 */
public class ItemOperacaoFinanceira {

    private int codigo;
    private Racao racao;
    private int quantidade;

    public ItemOperacaoFinanceira() {
    }

    public ItemOperacaoFinanceira(Racao racao, int quantidade) {
        this.racao = racao;
        this.quantidade = quantidade;
    }

    public ItemOperacaoFinanceira(int codigo, Racao racao, int quantidade) {
        this.codigo = codigo;
        this.racao = racao;
        this.quantidade = quantidade;
    }  
    

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the racao
     */
    public Racao getRacao() {
        return racao;
    }

    /**
     * @param racao the racao to set
     */
    public void setRacao(Racao racao) {
        this.racao = racao;
    }

    public double calcularValor() {
        return this.racao.getValor() * this.quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ItemOperacaoFinanceira other = (ItemOperacaoFinanceira) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String texto = this.racao.toString() + "\n"
                + "Quantidade: " + this.quantidade + "\n"
                + "Valor Final: " + this.calcularValor() + "\n";
        return texto;
    }

}
