/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abatalhafinal;

/**
 *
 * @author layla
 */
public class Basicas extends Maldicoes {

    public Basicas(int ataque, String obscuro, int codigo, String nome, double peso, double altura) {
        super(ataque, obscuro, codigo, nome, peso, altura);
        this.energia = 50;
        this.ataque = 3;
    }
}
