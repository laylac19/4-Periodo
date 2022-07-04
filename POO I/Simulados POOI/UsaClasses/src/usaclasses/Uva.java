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
public class Uva extends Fruta {

    public Uva(double peso, String validade) {
        super(peso, validade, "Uva");
    }

    @Override
    public String getNutrientes() {
       return "Cobre e Vitamina K";
    }
    
    
}
