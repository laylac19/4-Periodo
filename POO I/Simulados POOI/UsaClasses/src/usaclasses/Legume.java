/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usaclasses;

/**
 *
 * @author 1547906
 */
public abstract class Legume extends Alimento {
    private Legume combinado;

    public Legume(double peso, String validade, String nome) {
        super(peso, validade, nome);
    }


    public void combinar(Legume l2) {
        this.combinado = l2;
    }

    public String getCombinacao() {
        return  this.getNome() +
                " e " 
                + this.combinado.getNome();
    }
    
    
    
}
