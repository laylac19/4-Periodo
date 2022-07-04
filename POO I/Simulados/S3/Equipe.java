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
public abstract class Equipe {
    // Equipes tem quantidade máxima de membros, quantidade atual de membros, desempenho padrão e
//quantidade de partidas disputadas;
    private int qtMaxMembros;
    private int qtAtualMembros;
    protected int desempenho;
    private int qtPartidasDisputadas;

    public Equipe(int qtAtualMembros, int qtMaxMembros) {
        this.qtMaxMembros = qtMaxMembros;
        this.qtAtualMembros = qtAtualMembros;
        this.desempenho = 1;
        this.qtPartidasDisputadas = 0;
    }
    
    public String jogar(Equipe equipe2){
        this.qtPartidasDisputadas++;
        equipe2.qtPartidasDisputadas++;
        return "";
    }

    public int getDesempenho() {
        return desempenho;
    }
    

    protected static String definirVencedor(Equipe equipe1, Equipe equipe2) {
        double valorEQuipe1 = Math.random();
        double valorEquipe2 = Math.random();
        if ((valorEQuipe1 * equipe1.getDesempenho()) > valorEquipe2 * equipe2.getDesempenho()) {
            return equipe1.getClass().getSimpleName() + " VENCEU " + equipe2.getClass().getSimpleName();
        } else {
            return equipe1.getClass().getSimpleName() + " PERDEU para " + equipe2.getClass().getSimpleName();
        }

    }
}
