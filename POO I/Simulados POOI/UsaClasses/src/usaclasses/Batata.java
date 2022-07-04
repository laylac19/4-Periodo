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
public class Batata extends Legume{

    public Batata(double peso, String validade) {
        super(peso, validade, "Batata");
    }

    @Override
    public String getNutrientes() {
        return "Cálcio, Ferro, Potássio, Fosforo e Carboidratos";
    }

    
}
