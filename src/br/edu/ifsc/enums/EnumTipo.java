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
public enum EnumTipo {
    FILHOTE("Filhote"), ADULTO("Adulto"), SENIOR("Senior"), CASTRADO("Castrado");
    
    private String texto;
    
    private EnumTipo(String texto){
        this.texto = texto;
    }

    @Override
    public String toString() {
        return this.texto;
    }
    
    
}
