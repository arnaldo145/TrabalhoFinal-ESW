/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.storage;

import br.edu.ifsc.interfaces.IStorage;
import br.edu.ifsc.model.Fornecedor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class FornecedorStorage implements IStorage<Fornecedor>{
    
    private List<Fornecedor> listaFornecedor;

    public FornecedorStorage() {
        this.listaFornecedor = new ArrayList<>();
    }
    
    @Override
    public boolean save(List<Fornecedor> listaFornecedor) {
        this.listaFornecedor = listaFornecedor;
        return true;
    }

    @Override
    public List<Fornecedor> recover() {
        return this.listaFornecedor;
    }

    @Override
    @Deprecated
    public void preencherArray() {
        Fornecedor fornecedor;
        fornecedor = new Fornecedor("Site 1", "Fornecedor 1", "34534534", "3434534", "sdfsdfsdf");
        this.listaFornecedor.add(fornecedor);
        fornecedor = new Fornecedor("Site 2", "Fornecedor 2", "456546", "456456", "xcbvfsdfgdf");
        this.listaFornecedor.add(fornecedor);
        fornecedor = new Fornecedor("Site 3", "Fornecedor 3", "456567567", "234234234", "bnmvbnmvbn");
        this.listaFornecedor.add(fornecedor);
        fornecedor = new Fornecedor("Site 4", "Fornecedor 4", "34456657", "123123245", "gfhjsdfs");
        this.listaFornecedor.add(fornecedor);
        fornecedor = new Fornecedor("Site 5", "Fornecedor 5", "2344565456", "7465534", "nvbnbvdfgdf");
        this.listaFornecedor.add(fornecedor);
        fornecedor = new Fornecedor("Site 6", "Fornecedor 6", "789067534", "08623443234", "muyyufghfg");
        this.listaFornecedor.add(fornecedor);
    }
    
}
