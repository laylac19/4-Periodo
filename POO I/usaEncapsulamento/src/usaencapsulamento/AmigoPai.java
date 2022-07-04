/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usaencapsulamento;

/**
 *
 * @author 2020122760102
 */
public class AmigoPai {
    public void acessandoPai(){
        Pai pai = new Pai();
        pai.atributo_protected_pai = "Amigo";
        pai.atributo_public_pai = "Amigo";
    }
}
