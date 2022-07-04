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
public class Asimov2D extends Soccer2D {
    

    public Asimov2D(String caminhoLogo, int qtAtualMembros, int qtMaxMembros) {
        super(caminhoLogo, qtAtualMembros, qtMaxMembros);
    }
    
    
    
    @Override
    public String jogar(Equipe equipe2) {
        super.jogar(equipe2); 
        this.desempenho++;
        return Equipe.definirVencedor(this, equipe2);
    }
}
