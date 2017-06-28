/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.controller;

import br.edu.ifsc.abstracts.AbstractOperacaoFinanceira;
import br.edu.ifsc.abstracts.AbstractPessoaFisica;
import br.edu.ifsc.lists.ItemOperacaoFinanceiraLista;
import br.edu.ifsc.model.Cliente;
import br.edu.ifsc.model.Compra;
import br.edu.ifsc.model.Fornecedor;
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
    
    public static OperacaoFinanceiraController INSTANCIA;
    
    private  OperacaoFinanceiraController() {
        listaOperacoes = new ArrayList<>();
    }
    
    public static OperacaoFinanceiraController getInstance(){
        if(INSTANCIA == null){
            INSTANCIA = new OperacaoFinanceiraController();
        }
        return INSTANCIA;
    }
    
    
    public double ralizarVenda(Cliente cliente, ItemOperacaoFinanceiraLista listaRacao){
        operaco = new Venda(cliente, listaRacao);
        this.listaOperacoes.add(operaco);
        return this.operaco.realizarOperacao();
    }
    
    public double ralizarVenda(Cliente cliente, ItemOperacaoFinanceiraLista listaRacao, double desconto){
        operaco = new Venda(desconto, cliente, listaRacao);
        this.listaOperacoes.add(operaco);
        return ((Venda)this.operaco).realizarOperacao(desconto);
    }
    
    public double ralizarCompra(Fornecedor fornecedor, ItemOperacaoFinanceiraLista listaRacao){
        operaco = new Compra(fornecedor, listaRacao);
        this.listaOperacoes.add(operaco);
        return this.operaco.realizarOperacao();
    }
    
    public double ralizarCompra(Fornecedor fornecedor, ItemOperacaoFinanceiraLista listaRacao, int parcelas){
        operaco = new Compra(parcelas, fornecedor, listaRacao);
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
