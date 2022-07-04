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
public class AsimovSEK extends SEK {


    public AsimovSEK(int qtRobos, int qtAtualMembros, int qtMaxMembros) {
        super(qtRobos, qtAtualMembros, qtMaxMembros);
    }

    @Override
    public String jogar(Equipe equipe2) {
        super.jogar(equipe2); 
        if(this.qtRobos == 3){
            this.desempenho += 3;
        }
        return Equipe.definirVencedor(this, equipe2);
    }
    
}
