/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulado5;

/**
 *
 * @author layla
 */
public class Filosofia extends Humanas {

    public Filosofia(String ementa, String conteudo) {
        super(ementa, conteudo);
    }

    @Override
    public String getLema() {
        return "Penso logo existo";
    }

    @Override
    public String toString() {
        return "Filosofia tem ementa = " + this.getConteudo() + " e Conteúdo prográmatico = " + this.getConteudo();
    }
    
}
