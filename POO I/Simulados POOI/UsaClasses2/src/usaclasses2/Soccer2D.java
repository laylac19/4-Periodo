/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usaclasses2;

/**
 *
 * @author 1547906
 */
public abstract class Soccer2D extends Equipe {
    private String caminhoLogo;

    public Soccer2D(String caminhoLogo, int qtAtualMembros, int qtMaxMembros) {
        super(qtAtualMembros, qtMaxMembros);
        this.caminhoLogo = caminhoLogo;
    }
 
    
}
