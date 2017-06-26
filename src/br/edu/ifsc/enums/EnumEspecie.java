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
public enum EnumEspecie{
    CACHORRO("Cachorro"), GATO("Gato");
    
    private final String texto;
    
    private EnumEspecie(String texto){
        this.texto = texto;
    }

    @Override
    public String toString() {
        return this.texto;
    }
    
    
}
