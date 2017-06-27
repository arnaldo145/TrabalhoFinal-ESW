/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.interfaces;

import java.util.List;

/**
 *
 * @author Aluno
 */
public interface IStorage<T> {
    public boolean save(List<T> lista);
    public List<T> recover();
    @Deprecated
    public void preencherArray();
}
