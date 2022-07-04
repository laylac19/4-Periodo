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
public class Pai {
    public String atributo_public_pai;
    private String atributo_private_pai;
    protected String atributo_protected_pai;

    public void testarAtributosPai() {
        this.atributo_private_pai = "Acessando privado";
        this.atributo_protected_pai = "Acessando protegido";
        this.atributo_public_pai = "Acessando público";
    }
}
