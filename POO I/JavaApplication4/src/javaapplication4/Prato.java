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
public class Prato {
    private String nome;
    private String inventor;

    public Prato(String Nome, String Inventor) {
        this.nome = Nome;
        this.inventor = Inventor;
    }

    public String getNome() {
        return nome;
    }

    public String getInventor() {
        return inventor;
    }
}
