/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.lists;

import br.edu.ifsc.model.ItemOperacaoFinanceira;
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
    public void testAdd() {
        System.out.println("add");
        ItemOperacaoFinanceira item = null;
        ItemOperacaoFinanceiraLista instance = new ItemOperacaoFinanceiraLista();
        boolean expResult = false;
        boolean result = instance.add(item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class ItemOperacaoFinanceiraLista.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        ItemOperacaoFinanceira item = null;
        ItemOperacaoFinanceiraLista instance = new ItemOperacaoFinanceiraLista();
        boolean expResult = false;
        boolean result = instance.remove(item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of upadate method, of class ItemOperacaoFinanceiraLista.
     */
    @Test
    public void testUpadate() {
        System.out.println("upadate");
        ItemOperacaoFinanceira novoItem = null;
        int index = 0;
        ItemOperacaoFinanceiraLista instance = new ItemOperacaoFinanceiraLista();
        instance.upadate(novoItem, index);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class ItemOperacaoFinanceiraLista.
     */
    @Test
    public void testGet() {
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
