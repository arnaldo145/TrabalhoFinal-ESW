/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.storage;

import br.edu.ifsc.enums.EnumEspecie;
import br.edu.ifsc.enums.EnumPorte;
import br.edu.ifsc.enums.EnumTipo;
import br.edu.ifsc.interfaces.IStorage;
import br.edu.ifsc.model.Racao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class RacaoStorage implements IStorage<Racao>{
    
    private List<Racao> listaRacao;

    public RacaoStorage() {
        this.listaRacao = new ArrayList<>();
    }
    
    @Deprecated
    @Override
    public void preencherArray(){
        Racao racao;
        racao = new Racao("Ração 1 p/ Gatos", 10, 25, EnumEspecie.GATO, EnumPorte.MINI, EnumTipo.FILHOTE);
        this.listaRacao.add(racao);
        racao = new Racao("Ração 2 p/ Gatos", 5, 12, EnumEspecie.GATO, EnumPorte.GRANDE, EnumTipo.SENIOR);
        this.listaRacao.add(racao);
        racao = new Racao("Ração 1 p/ Cães", 13, 3, EnumEspecie.CACHORRO, EnumPorte.PEQUENO, EnumTipo.FILHOTE);
        this.listaRacao.add(racao);
        racao = new Racao("Ração 2 p/ Cães", 11, 25, EnumEspecie.CACHORRO, EnumPorte.MEDIO, EnumTipo.ADULTO);
        this.listaRacao.add(racao);
    }

    @Override
    public boolean save(List<Racao> listaRacao) {
        this.listaRacao = listaRacao;
        return true;
    }

    @Override
    public List<Racao> recover() {
        return this.listaRacao;
    }
    
}
