/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.model;

import br.edu.ifsc.enums.EnumEspecie;
import br.edu.ifsc.enums.EnumPorte;
import br.edu.ifsc.enums.EnumTipo;
import interfaces.IItemLista;

/**
 *
 * @author Vitor
 */
public class Racao implements IItemLista{
    private String nome;
    private double peso;
    private double valor;
    private EnumEspecie especie;
    private EnumPorte porte;
    private EnumTipo tipo;

    public Racao() {
    }

    public Racao(String nome, double peso, double valor, EnumEspecie especie, EnumPorte porte, EnumTipo tipo) {
        this.nome = nome;
        this.peso = peso;
        this.valor = valor;
        this.especie = especie;
        this.porte = porte;
        this.tipo = tipo;
    }

    
    
    

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the especie
     */
    public EnumEspecie getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(EnumEspecie especie) {
        this.especie = especie;
    }

    /**
     * @return the porte
     */
    public EnumPorte getPorte() {
        return porte;
    }

    /**
     * @param porte the porte to set
     */
    public void setPorte(EnumPorte porte) {
        this.porte = porte;
    }

    /**
     * @return the tipo
     */
    public EnumTipo getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(EnumTipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        String texto = "Nome: " + this.nome + "\n"
                + "Peso: " + this.peso + " Kg\n"
                + "Espécie: " + this.especie.toString() + "\n"
                + "Porte: " + this.porte.toString() + "\n"
                + "Tipo: " + this.tipo.toString() + "\n";
        return texto;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
    
    
}
