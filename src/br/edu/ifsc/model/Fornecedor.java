/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.model;

import br.edu.ifsc.abstracts.AbstractPessoaFisica;

/**
 *
 * @author Vitor
 */
public class Fornecedor extends AbstractPessoaFisica{
    private String url;

    public Fornecedor() {
    }

    public Fornecedor(String url) {
        this.url = url;
    }

    public Fornecedor(String url, String nome, String cnpj, String contato, String endereco) {
        super(nome, cnpj, contato, endereco);
        this.url = url;
    }

    @Override
    public String toString() {
        return super.toString() + this.url + "\n";
    }
    
    
    

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }
    
}
