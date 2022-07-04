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
public class Biologia extends Biomedicas {

    public Biologia(String ementa, String conteudo) {
        super(ementa, conteudo);
    }

    @Override
    public String getLema() {
        return "A vida é uma constante evolução";
    }

    @Override
    public String toString() {
        return "Biologia tem ementa = " + this.getConteudo() + " e Conteúdo prográmatico = " + this.getConteudo();
    }
}
