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
public class Filho extends Pai {
    public void testarAtributosPai() {
        this.atributo_private_pai = "Acessando privado";
        this.atributo_protected_pai = "Acessando protegido";
        this.atributo_public_pai = "Acessando público";
    }
}
