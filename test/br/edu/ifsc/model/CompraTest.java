/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.model;

import br.edu.ifsc.enums.EnumEspecie;
import br.edu.ifsc.enums.EnumPorte;
import br.edu.ifsc.enums.EnumTipo;
import br.edu.ifsc.lists.ItemOperacaoFinanceiraLista;
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
public class CompraTest {
    private Compra compra;
    public CompraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("* Início Testes da Classe Compra");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("* Fim Testes da Classe Compra");
    }
    
    @Before
    public void setUp() {
        Fornecedor fornecedor = new Fornecedor("sfsdf", "Fornecedor 1", "23423", "234234", "asasdas");
        ItemOperacaoFinanceiraLista listaRacao = new ItemOperacaoFinanceiraLista();
        listaRacao.add(new ItemOperacaoFinanceira(new Racao("Racao1", 20, 10, EnumEspecie.GATO, EnumPorte.MINI, EnumTipo.FILHOTE), 10));
        listaRacao.add(new ItemOperacaoFinanceira(new Racao("Racao2", 30, 5, EnumEspecie.CACHORRO, EnumPorte.PEQUENO, EnumTipo.FILHOTE), 14));
        listaRacao.add(new ItemOperacaoFinanceira(new Racao("Racao3", 13, 5, EnumEspecie.CACHORRO, EnumPorte.GIGANTE, EnumTipo.SENIOR), 6));
        this.compra = new Compra(fornecedor, listaRacao);
    }
    
    @After
    public void tearDown() {
        this.compra = null;
    }

    /**
     * Test of realizarOperacao method, of class Compra.
     */
    @Test
    public void testRealizarOperacao() {
        System.out.println("* Teste Realizar Operaçao");
        assertEquals(200, this.compra.realizarOperacao(), 0);
    }
    
    @Test
    public void testRealizarOperacaoComParcelas() {
        System.out.println("* Teste Realizar Operaçao com parcelas");
        assertEquals(40, this.compra.realizarOperacao(5), 0);
    }

    @Test(expected = NullPointerException.class)
    public void testRealizarOperacaoFornecedorNulo() {
        System.out.println("* Teste Realizar Operaçao com Fornecedor Nulo");
        this.compra.setPessoaFisica(null);
        this.compra.realizarOperacao();
    }
    
    @Test(expected = NullPointerException.class)
    public void testRealizarOperacaoComParcelasFornecedorNulo() {
        System.out.println("* Teste Realizar Operaçao com Parcelas e Fornecedor Nulo");
        this.compra.setPessoaFisica(null);
        this.compra.realizarOperacao(5);
    }
    
    @Test(expected = Error.class)
    public void testRealizarOperacaoListaVazia() {
        System.out.println("* Teste Realizar Operaçao com Lista Vazia");
        this.compra.setListaRacao(new ItemOperacaoFinanceiraLista());
        this.compra.realizarOperacao();
    }
    
    @Test(expected = Error.class)
    public void testRealizarOperacaoListaVaziaComParcelas() {
        System.out.println("* Teste Realizar Operaçao com Lista Vazia");
        this.compra.setListaRacao(new ItemOperacaoFinanceiraLista());
        this.compra.realizarOperacao(5);
    }
    
  
    /**
     * Test of toString method, of class Compra.
     */
    @Test
    public void testToString() {
        System.out.println("* Test to String");
        System.out.println(this.compra.toString());
    }
    
}
