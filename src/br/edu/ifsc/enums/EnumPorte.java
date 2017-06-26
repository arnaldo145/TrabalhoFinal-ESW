/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.enums;

/**
 *
 * @author Vitor
 */
public enum EnumPorte {
    MINI("Mini"), PEQUENO("Pequeno"), MEDIO("Médio"), GRANDE("Grande"), GIGANTE("Gigante");
    
    private String texto;
    
    private EnumPorte(String texto){
        this.texto = texto;
    }

    @Override
    public String toString() {
        return this.texto;
    }
    
    
}
