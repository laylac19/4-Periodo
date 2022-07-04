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
public class Inhame extends Legume {

    public Inhame(double peso, String validade) {
        super(peso, validade, "Inhame");
    }

    @Override
    public String getNutrientes() {
        return "Ferro, Proteína e Fibras";
    }
    
}
