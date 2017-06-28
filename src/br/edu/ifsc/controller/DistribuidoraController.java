/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.controller;

import br.edu.ifsc.abstracts.AbstractOperacaoFinanceira;
import br.edu.ifsc.lists.ClienteLista;
import br.edu.ifsc.lists.FornecedorLista;
import br.edu.ifsc.lists.ItemOperacaoFinanceiraLista;
import br.edu.ifsc.lists.RacaoLista;
import br.edu.ifsc.model.Cliente;
import br.edu.ifsc.model.Compra;
import br.edu.ifsc.model.Fornecedor;
import br.edu.ifsc.model.ItemOperacaoFinanceira;
import br.edu.ifsc.model.NotaFiscal;
import br.edu.ifsc.model.Racao;
import br.edu.ifsc.model.Venda;
import br.edu.ifsc.storage.controller.ModelStorageController;
import java.util.List;


/**
 *
 * @author Vitor
 */
public class DistribuidoraController {
    private ClienteLista listaCliente;
    private FornecedorLista listaFornecedor;
    private RacaoLista listaRacao;
    private ItemOperacaoFinanceiraLista listaItemOperacao;
    private ModelStorageController modelStorageController;
    private OperacaoFinanceiraController operacaoFinanaceiraControler;
    
    public static DistribuidoraController INSTANCE;
   
    private DistribuidoraController() {
        this.listaCliente = new ClienteLista();
        this.listaRacao = new RacaoLista();
        this.listaFornecedor = new FornecedorLista();
        this.modelStorageController = new ModelStorageController();
        this.listaItemOperacao = new ItemOperacaoFinanceiraLista();
        this.operacaoFinanaceiraControler = OperacaoFinanceiraController.getInstance();
        this.inicilaizarListas();
    }
    
    public static DistribuidoraController getInstance(){
        if(INSTANCE == null){
            INSTANCE = new DistribuidoraController();
        }
        return INSTANCE;
    }
    
    
    private void inicilaizarListas(){
        this.getListaCliente().setLista(this.getModelStorageController().recoverClientes());
        this.getListaRacao().setLista(this.getModelStorageController().recoverRacoes());
        this.getListaFornecedor().setLista(this.getModelStorageController().recoverFornecedores());
    }

    /**
     * @return the listaCliente
     */
    public ClienteLista getListaCliente() {
        return listaCliente;
    }

    /**
     * @param listaCliente the listaCliente to set
     */
    public void setListaCliente(ClienteLista listaCliente) {
        this.listaCliente = listaCliente;
    }

    /**
     * @return the listaFornecedor
     */
    public FornecedorLista getListaFornecedor() {
        return listaFornecedor;
    }

    /**
     * @param listaFornecedor the listaFornecedor to set
     */
    public void setListaFornecedor(FornecedorLista listaFornecedor) {
        this.listaFornecedor = listaFornecedor;
    }

    /**
     * @return the listaRacao
     */
    public RacaoLista getListaRacao() {
        return listaRacao;
    }

    /**
     * @param listaRacao the listaRacao to set
     */
    public void setListaRacao(RacaoLista listaRacao) {
        this.listaRacao = listaRacao;
    }
    
    /**
     * @return the listaItemOperacao
     */
    public ItemOperacaoFinanceiraLista getListaItemOperacao() {
        return listaItemOperacao;
    }

    /**
     * @param listaItemOperacao the listaItemOperacao to set
     */
    public void setListaItemOperacao(ItemOperacaoFinanceiraLista listaItemOperacao) {
        this.listaItemOperacao = listaItemOperacao;
    }

    /**
     * @return the modelStorageController
     */
    public ModelStorageController getModelStorageController() {
        return modelStorageController;
    }

    /**
     * @param modelStorageController the modelStorageController to set
     */
    public void setModelStorageController(ModelStorageController modelStorageController) {
        this.modelStorageController = modelStorageController;
    }
    
    public OperacaoFinanceiraController getOperacaoFinanaceiraControler() {
        return operacaoFinanaceiraControler;
    }

    public void setOperacaoFinanaceiraControler(OperacaoFinanceiraController operacaoFinanaceiraControler) {
        this.operacaoFinanaceiraControler = operacaoFinanaceiraControler;
    }
    
    
    public boolean add(Cliente cliente){
        return this.listaCliente.add(cliente);
    }
    
    public void update(Cliente novo, int index){
        this.listaCliente.upadate(novo, index);
    }
    
    public boolean remove(Cliente cliente){
        return this.listaCliente.remove(cliente);
    }
    
    public Cliente getCliente(int index){
        return this.listaCliente.get(index);
    }
    
    public List<Cliente> getAllClientes(){
        return this.listaCliente.getLista();
    }
    
    public boolean add(Fornecedor fornecedor){
        return this.listaFornecedor.add(fornecedor);
    }
    
    public boolean remove(Fornecedor fornecedor){
        return this.listaFornecedor.remove(fornecedor);
    }
    
    public void update(Fornecedor novo, int index){
        this.listaFornecedor.upadate(novo, index);
    }
    
    public Fornecedor getFornecedor(int index){
        return this.listaFornecedor.get(index);
    }
    
    public List<Fornecedor> getAllFornecedores(){
        return this.listaFornecedor.getLista();
    }
    
    public boolean add(Racao racao){
        return this.listaRacao.add(racao);
    }
    
    public boolean remove(Racao racao){
        return this.listaRacao.remove(racao);
    }
    
    public void update(Racao novo, int index){
        this.listaRacao.upadate(novo, index);
    }
    
    public Racao getRacao(int index){
        return this.listaRacao.get(index);
    }
    
    public List<Racao> getAllRacao(){
        return this.listaRacao.getLista();
    }
    
     public boolean add(ItemOperacaoFinanceira itemOperacao){
        return this.listaItemOperacao.add(itemOperacao);
    }
    
    public boolean remove(ItemOperacaoFinanceira racao){
        return this.listaItemOperacao.remove(racao);
    }
    
    public void update(ItemOperacaoFinanceira novo, int index){
        this.listaItemOperacao.upadate(novo, index);
    }
    
    public ItemOperacaoFinanceira getItemOperacaoFinanceira(int index){
        return this.listaItemOperacao.get(index);
    }
    
    public List<ItemOperacaoFinanceira> getItemOperacaoFinanceira(){
        return this.listaItemOperacao.getLista();
    }

    public double realizarVenda(Cliente cliente, List<ItemOperacaoFinanceira> listaRacao){
        return this.operacaoFinanaceiraControler.ralizarVenda(cliente, listaRacao);
    }
    
    public double realizarVenda(Cliente cliente, List<ItemOperacaoFinanceira> listaRacao, double desconto){
        return this.operacaoFinanaceiraControler.ralizarVenda(cliente, listaRacao, desconto);
    }
    
    public double realizarCompra(Fornecedor fornecedor, List<ItemOperacaoFinanceira> listaRacao){
        return this.operacaoFinanaceiraControler.ralizarCompra(fornecedor, listaRacao);
    }
    
    public double realizarCompra(Fornecedor fornecedor, List<ItemOperacaoFinanceira> listaRacao, int prazo){
        return this.operacaoFinanaceiraControler.ralizarCompra(fornecedor, listaRacao, prazo);
    }
    
    public String gerarNotaFiscalCompra(){
        String texto = "";
        for (AbstractOperacaoFinanceira operacao: this.operacaoFinanaceiraControler.getListaOperacoes()) {
            if(operacao instanceof Compra){
                texto += new NotaFiscal(operacao).gerarNota();
            }
        }
        return texto;
    }
    
    public String gerarNotaFiscalVenda(){
        String texto = "";
        for (AbstractOperacaoFinanceira operacao: this.operacaoFinanaceiraControler.getListaOperacoes()) {
            if(operacao instanceof Venda){
                texto += new NotaFiscal(operacao).gerarNota();
            }
        }
        return texto;
    }
    
    
}
