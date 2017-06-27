/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.storage.controller;

import br.edu.ifsc.model.Cliente;
import br.edu.ifsc.model.Fornecedor;
import br.edu.ifsc.model.Racao;
import br.edu.ifsc.storage.ClienteStorage;
import br.edu.ifsc.storage.FornecedorStorage;
import br.edu.ifsc.storage.RacaoStorage;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ModelStorageController {
    private ClienteStorage clienteStorage;
    private FornecedorStorage fornecedorStorage;
    private RacaoStorage racaoStorage;

    public ModelStorageController() {
        this.clienteStorage = new ClienteStorage();
        this.fornecedorStorage = new FornecedorStorage();
        this.racaoStorage = new RacaoStorage();
    }
    
    public List<Cliente> recoverClientes(){
        return this.clienteStorage.recover();
    }
    
    public List<Fornecedor> recoverFornecedores(){
        return this.fornecedorStorage.recover();
    }
    
    public List<Racao> recoverRacoes(){
        return this.racaoStorage.recover();
    }
    
    public boolean saveClientes(List<Cliente> listaCliente){
        return this.clienteStorage.save(listaCliente);
    }
    
    public boolean saveFornecedores(List<Fornecedor> listafornecedores){
        return this.fornecedorStorage.save(listafornecedores);
    }
    
    public boolean saveRacoes(List<Racao> listaRacao){
        return this.racaoStorage.save(listaRacao);
    }
    
    public boolean saveAll(List<Cliente> listacliClientes, List<Fornecedor> listaFornecedores, List<Racao> listaRacoes){
        this.saveClientes(listacliClientes);
        this.saveFornecedores(listaFornecedores);
        this.saveRacoes(listaRacoes);
        return true;
    }

    /**
     * @return the clienteStorage
     */
    public ClienteStorage getClienteStorage() {
        return clienteStorage;
    }

    /**
     * @param clienteStorage the clienteStorage to set
     */
    public void setClienteStorage(ClienteStorage clienteStorage) {
        this.clienteStorage = clienteStorage;
    }

    /**
     * @return the fornecedorStorage
     */
    public FornecedorStorage getFornecedorStorage() {
        return fornecedorStorage;
    }

    /**
     * @param fornecedorStorage the fornecedorStorage to set
     */
    public void setFornecedorStorage(FornecedorStorage fornecedorStorage) {
        this.fornecedorStorage = fornecedorStorage;
    }

    /**
     * @return the racaoStorage
     */
    public RacaoStorage getRacaoStorage() {
        return racaoStorage;
    }

    /**
     * @param racaoStorage the racaoStorage to set
     */
    public void setRacaoStorage(RacaoStorage racaoStorage) {
        this.racaoStorage = racaoStorage;
    }
    
    
}
