/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author 2020122760102
 */
public class Cliente {
    private String nome;
    private Prato prato;

    public Cliente(String nome, Prato prato) {
        this.nome = nome;
        this.prato = prato;
    }

    public Prato getPrato() {
        return prato;
    }

    public String getNome() {
        return nome;
    }
}
