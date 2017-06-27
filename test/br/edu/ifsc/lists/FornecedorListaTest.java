/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.lists;

import br.edu.ifsc.model.Fornecedor;
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
public class FornecedorListaTest {
    private FornecedorLista listaFornecedor;
    
    public FornecedorListaTest() {
        this.listaFornecedor = new FornecedorLista();
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("===== Início Testes FornecedorLista =====");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("===== Fim Testes FornecedorLista =====");
    }
    
    @Before
    public void setUp() {
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
    
    @After
    public void tearDown() {
        this.listaFornecedor = new FornecedorLista();
    }

    /**
     * Test of add method, of class FornecedorLista.
     */
    @Test
    public void testAdd() {
        System.out.println("* Teste Adicionar");
        Fornecedor fornecedor = new Fornecedor("Url 1", "Fornecedor Aux", "456456456", "sdfgsdf", "dfgdfg");
        assertTrue(this.listaFornecedor.add(fornecedor));
    }

    /**
     * Test of remove method, of class FornecedorLista.
     */
    @Test
    public void testRemove() {
        System.out.println("* Teste Remover");
        assertTrue(this.listaFornecedor.remove(this.listaFornecedor.get(0)));
    }
    
    @Test
    public void testRemoveFornecedorQueNaoPerteceALista() {
        System.out.println("* Teste Remover Fornecedor que não Pertence a Lista");
        assertFalse(this.listaFornecedor.remove(new Fornecedor()));
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveIndexInesistente() {
        System.out.println("* Teste Remover com Index Inesistente");
        this.listaFornecedor.remove(this.listaFornecedor.get(100));
    }

    /**
     * Test of upadate method, of class FornecedorLista.
     */
    @Test
    public void testUpadate() {
        System.out.println("* Teste Update");
        Fornecedor novoFornecedor = this.listaFornecedor.get(0);
        novoFornecedor.setUrl("novaUrl");
        this.listaFornecedor.upadate(novoFornecedor, 0);
        assertEquals("novaUrl", this.listaFornecedor.get(0).getUrl());
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testUpadateIndexInesistente() {
        System.out.println("* Teste Update com Index Inesistente");
        Fornecedor novoFornecedor = this.listaFornecedor.get(0);
        novoFornecedor.setNome("Nome Modificado");
        this.listaFornecedor.upadate(novoFornecedor, 100);
        assertEquals("Nome Modificado", this.listaFornecedor.get(0).getNome());
    }

    /**
     * Test of get method, of class FornecedorLista.
     */
    @Test
    public void testGet() {
        System.out.println("* Teste Get");
        Fornecedor fornecedor = new Fornecedor("Site 7", "Fornecedor 7", "34534534", "3434534", "sdfsdfsdf");
        this.listaFornecedor.add(fornecedor);
        assertEquals(fornecedor, this.listaFornecedor.get(6));
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetInesistente() {
       System.out.println("* Teste Get Inesistente");
       this.listaFornecedor.get(100);
    }
}
