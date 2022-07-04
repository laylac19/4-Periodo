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
public class Morango extends Fruta {

    public Morango(double peso, String validade) {
        super(peso, validade, "Morango");
    }

    @Override
    public String getNutrientes() {
        return "Potássio e Vitamina A";
    }
    
}
