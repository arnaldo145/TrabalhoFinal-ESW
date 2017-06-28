/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.lists;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Aluno
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({br.edu.ifsc.lists.ClienteListaTest.class, br.edu.ifsc.lists.ItemOperacaoFinanceiraListaTest.class, br.edu.ifsc.lists.RacaoListaTest.class, br.edu.ifsc.lists.FornecedorListaTest.class})
public class SampleTestSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
