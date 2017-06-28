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
 * @author Aluno
 */
public class ItemOperacaoFinanceiraListaTest {

    public ItemOperacaoFinanceiraListaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
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
        Racao racao = new Racao("Guabi Natural", 5.0, 20.00, EnumEspecie.GATO, EnumPorte.PEQUENO, EnumTipo.FILHOTE);
        ItemOperacaoFinanceira itemOperacaoFinanceira = new ItemOperacaoFinanceira(racao, 1);
        ItemOperacaoFinanceiraLista itemOperacaoFinanceiraLista = new ItemOperacaoFinanceiraLista();

        assertTrue(itemOperacaoFinanceiraLista.add(itemOperacaoFinanceira));
    }

    /**
     * Test of remove method, of class ItemOperacaoFinanceiraLista.
     */
    @Test
    public void deveRemoverItemOperacaoFinanceira() {
        System.out.println("Teste - Deve remover ItemOperacaoFinanceira");
        Racao racao = new Racao("Guabi Natural", 5.0, 20.00, EnumEspecie.GATO, EnumPorte.PEQUENO, EnumTipo.FILHOTE);
        ItemOperacaoFinanceira itemOperacaoFinanceira = new ItemOperacaoFinanceira(1, racao, 5);
        ItemOperacaoFinanceiraLista itemOperacaoFinanceiraLista = new ItemOperacaoFinanceiraLista();
        itemOperacaoFinanceiraLista.add(itemOperacaoFinanceira);

        assertTrue(itemOperacaoFinanceiraLista.remove(itemOperacaoFinanceira));
    }

    /**
     * Test of upadate method, of class ItemOperacaoFinanceiraLista.
     */
    @Test
    public void atualizarItemOperacaoFinanceira() {
        System.out.println("Teste - Deve atualizar ItemOperacaoFinanceira");
        Racao racao = new Racao("Guabi Natural", 5.0, 20.00, EnumEspecie.GATO, EnumPorte.PEQUENO, EnumTipo.FILHOTE);
        ItemOperacaoFinanceira itemOperacaoFinanceira = new ItemOperacaoFinanceira(1, racao, 5);
        ItemOperacaoFinanceiraLista itemOperacaoFinanceiraLista = new ItemOperacaoFinanceiraLista();
        itemOperacaoFinanceiraLista.add(itemOperacaoFinanceira);
        
        racao.setValor(25.00);
        assertTrue(itemOperacaoFinanceiraLista.update(itemOperacaoFinanceira, 0));
        
        
        ItemOperacaoFinanceira novoItem = null;
        int index = 0;
        ItemOperacaoFinanceiraLista instance = new ItemOperacaoFinanceiraLista();
        instance.update(novoItem, index);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class ItemOperacaoFinanceiraLista.
     */
    @Test
    public void obterItemOperacaoFinanceira() {
        System.out.println("get");
        int index = 0;
        ItemOperacaoFinanceiraLista instance = new ItemOperacaoFinanceiraLista();
        ItemOperacaoFinanceira expResult = null;
        ItemOperacaoFinanceira result = instance.get(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
