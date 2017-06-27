/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.model;

import br.edu.ifsc.abstracts.AbstractOperacaoFinanceira;

/**
 *
 * @author Vitor
 */
public class NotaFiscal {
    private AbstractOperacaoFinanceira operacaoFinanceira;

   
    public NotaFiscal(AbstractOperacaoFinanceira operacaoFinanceira) {
        this.operacaoFinanceira = operacaoFinanceira;
    }
    
    public String gerarNota(){
        String texto = "==== Nota Fiscal ====\n";
        if(this.operacaoFinanceira instanceof Compra){
            texto += ((Compra)this.operacaoFinanceira).toString() + "\n";
        }
        if(this.operacaoFinanceira instanceof Venda){
            texto += ((Venda)this.operacaoFinanceira).toString() + "\n";
        }
        texto += "=============================";
        return texto;
    }

    /**
     * @return the operacaoFinanceira
     */
    public AbstractOperacaoFinanceira getOperacaoFinanceira() {
        return operacaoFinanceira;
    }

    /**
     * @param operacaoFinanceira the operacaoFinanceira to set
     */
    public void setOperacaoFinanceira(AbstractOperacaoFinanceira operacaoFinanceira) {
        this.operacaoFinanceira = operacaoFinanceira;
    }
}
