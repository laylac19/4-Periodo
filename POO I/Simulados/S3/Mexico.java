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
public class Mexico extends SEK{

    public Mexico(int qtRobos, int qtAtualMembros, int qtMaxMembros) {
        super(qtRobos, qtAtualMembros, qtMaxMembros);
        this.desempenho += 5;
    }

    @Override
    public String jogar(Equipe equipe2) {
        super.jogar(equipe2); 
        this.desempenho--;
        return "";
    }
    
    
    
}
