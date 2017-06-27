/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.controller;

import br.edu.ifsc.abstracts.AbstractOperacaoFinanceira;
import br.edu.ifsc.abstracts.AbstractPessoaFisica;
import br.edu.ifsc.model.Compra;
import br.edu.ifsc.model.ItemOperacaoFinanceira;
import br.edu.ifsc.model.Venda;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class OperacaoFinanceiraController {
    private List<AbstractOperacaoFinanceira> listaOperacoes;
    private AbstractOperacaoFinanceira operaco;
    
    public OperacaoFinanceiraController() {
        listaOperacoes = new ArrayList<>();
    }
    
    public double ralizarVenda(AbstractPessoaFisica pessoa, List<ItemOperacaoFinanceira> listaRacao){
        operaco = new Venda(pessoa, listaRacao);
        this.listaOperacoes.add(operaco);
        return this.operaco.realizarOperacao();
    }
    
    public double ralizarVenda(AbstractPessoaFisica pessoa, List<ItemOperacaoFinanceira> listaRacao, double desconto){
        operaco = new Venda(desconto, pessoa, listaRacao);
        this.listaOperacoes.add(operaco);
        return ((Venda)this.operaco).realizarOperacao(desconto);
    }
    
    public double ralizarCompra(AbstractPessoaFisica pessoa, List<ItemOperacaoFinanceira> listaRacao){
        operaco = new Compra(pessoa, listaRacao);
        this.listaOperacoes.add(operaco);
        return this.operaco.realizarOperacao();
    }
    
    public double ralizarCompra(AbstractPessoaFisica pessoa, List<ItemOperacaoFinanceira> listaRacao, int parcelas){
        operaco = new Venda(parcelas, pessoa, listaRacao);
        this.listaOperacoes.add(operaco);
        return ((Compra)this.operaco).realizarOperacao(parcelas);
    }

    /**
     * @return the listaOperacoes
     */
    public List<AbstractOperacaoFinanceira> getListaOperacoes() {
        return listaOperacoes;
    }

    /**
     * @param listaOperacoes the listaOperacoes to set
     */
    public void setListaOperacoes(List<AbstractOperacaoFinanceira> listaOperacoes) {
        this.listaOperacoes = listaOperacoes;
    }

    /**
     * @return the operaco
     */
    public AbstractOperacaoFinanceira getOperaco() {
        return operaco;
    }

    /**
     * @param operaco the operaco to set
     */
    public void setOperaco(AbstractOperacaoFinanceira operaco) {
        this.operaco = operaco;
    }
 
}
