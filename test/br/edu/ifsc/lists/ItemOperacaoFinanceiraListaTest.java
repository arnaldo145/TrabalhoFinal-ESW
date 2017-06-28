/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.lists;

import br.edu.ifsc.enums.EnumEspecie;
import br.edu.ifsc.enums.EnumPorte;
import br.edu.ifsc.enums.EnumTipo;
import br.edu.ifsc.model.ItemOperacaoFinanceira;
import br.edu.ifsc.model.Racao;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Arnaldo
 */
public class ItemOperacaoFinanceiraListaTest {

    private ItemOperacaoFinanceiraLista itemOperacaoFinanceiraLista;

    public ItemOperacaoFinanceiraListaTest() {
        this.itemOperacaoFinanceiraLista = new ItemOperacaoFinanceiraLista();
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("===== Iniciando testes da classe ItemOperacaoFinanceiraLista =====");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("===== Finalizando testes da classe ItemOperacaoFinanceiraLista =====");
    }

    @Before
    public void setUp() {
        Racao racao1 = new Racao("Guabi Natural", 5.0, 20.00, EnumEspecie.GATO, EnumPorte.PEQUENO, EnumTipo.FILHOTE);
        Racao racao2 = new Racao("GranPlus", 5.0, 15.00, EnumEspecie.CACHORRO, EnumPorte.MEDIO, EnumTipo.ADULTO);

        ItemOperacaoFinanceira itemOperacaoFinanceira1 = new ItemOperacaoFinanceira(1, racao1, 5);
        this.itemOperacaoFinanceiraLista.add(itemOperacaoFinanceira1);
        ItemOperacaoFinanceira itemOperacaoFinanceira2 = new ItemOperacaoFinanceira(2, racao2, 10);
        this.itemOperacaoFinanceiraLista.add(itemOperacaoFinanceira2);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class ItemOperacaoFinanceiraLista.
     */
    @Test
    public void deveAdicionarItemOperacaoFinanceira() {
        System.out.println("Teste - Deve Adicionar ItemOperacaoFinanceira");

        Racao racao
                = new Racao("GranPlus", 5.0, 25.00, EnumEspecie.CACHORRO,
                        EnumPorte.MEDIO, EnumTipo.FILHOTE);
        ItemOperacaoFinanceira itemOperacaoFinanceira
                = new ItemOperacaoFinanceira(3, racao, 15);

        assertTrue(itemOperacaoFinanceiraLista.add(itemOperacaoFinanceira));
    }

    /**
     * Test of remove method, of class ItemOperacaoFinanceiraLista.
     */
    @Test
    public void deveRemoverItemOperacaoFinanceira() {
        System.out.println("Teste - Deve remover ItemOperacaoFinanceira");
        
        ItemOperacaoFinanceira itemOperacaoFinanceira = this.itemOperacaoFinanceiraLista.get(1);       
        assertTrue(itemOperacaoFinanceiraLista.remove(itemOperacaoFinanceira));
    }

    /**
     * Test of update method, of class ItemOperacaoFinanceiraLista.
     */
    @Test
    public void atualizarItemOperacaoFinanceira() {
        System.out.println("Teste - Deve atualizar ItemOperacaoFinanceira");

        ItemOperacaoFinanceira itemOperacaoFinanceira = this.itemOperacaoFinanceiraLista.get(0);   
        itemOperacaoFinanceira.setQuantidade(30);
        
        assertTrue(this.itemOperacaoFinanceiraLista.update(itemOperacaoFinanceira, 0));
    }

    /**
     * Test of get method, of class ItemOperacaoFinanceiraLista.
     */
    @Test
    public void obterItemOperacaoFinanceira() {
        System.out.println("Teste - Deve obter ItemOperacaoFinanceira");

        assertEquals(1, itemOperacaoFinanceiraLista.get(0).getCodigo());
    }

}
