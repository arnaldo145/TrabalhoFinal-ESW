/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.lists;

import br.edu.ifsc.enums.EnumEspecie;
import br.edu.ifsc.enums.EnumPorte;
import br.edu.ifsc.enums.EnumTipo;
import br.edu.ifsc.model.Racao;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aluno
 */
public class RacaoListaTest {

    private RacaoLista racaoLista;

    public RacaoListaTest() {
        this.racaoLista = new RacaoLista();
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("===== Iniciando testes da classe RacaoLista =====");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("===== Finalizando testes da classe RacaoLista =====");
    }

    @Before
    public void setUp() {
        Racao racao1 = new Racao("Guabi Natural", 5.0, 20.00, EnumEspecie.GATO, EnumPorte.PEQUENO, EnumTipo.FILHOTE);
        this.racaoLista.add(racao1);
        Racao racao2 = new Racao("GranPlus", 5.0, 15.00, EnumEspecie.CACHORRO, EnumPorte.MEDIO, EnumTipo.ADULTO);
        this.racaoLista.add(racao2);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of update method, of class RacaoLista.
     */
    @Test
    public void deveAtualizarRacao() {
        System.out.println("Teste - Atualização dos dados da ração");
        Racao racao = this.racaoLista.get(0);
        racao.setValor(35.00);

        assertTrue(this.racaoLista.update(racao, 0));
    }
    
    @Test
    public void deveObterRacaoPorEspecie(){
        assertFalse(this.racaoLista.getByEspecie(EnumEspecie.GATO).isEmpty());
    }
    
    @Test
    public void deveObterRacaoPorTipo(){
        assertFalse(this.racaoLista.getByTipo(EnumTipo.ADULTO).isEmpty());
    }
    
    @Test
    public void deveObterRacaoPorPorte(){
        assertFalse(this.racaoLista.getByPorte(EnumPorte.MEDIO).isEmpty());
    }
    
    @Test
    public void deveRemoverRacao(){
        System.out.println("Teste - Remover ração");
        Racao racao = this.racaoLista.get(0);
        
        assertTrue(this.racaoLista.remove(racao));
    }

}
