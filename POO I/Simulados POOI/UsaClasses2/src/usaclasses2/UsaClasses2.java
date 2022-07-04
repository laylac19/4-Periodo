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
public class UsaClasses2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Toda Equipe tem quantidade de membros atual e a quantidade máxima
        esses são os 2 últimos parâmetros dos construtores abaixo
        Equipes Soccer2D também tem o caminho da logo (primeiro parâmetro)
        Equipes SEK também tem a quantidade de robôs (primeiro parâmetro)
        Ex: equipe1 tem caminho c:/ e equipe2 tem 3 robos
         */
        Asimov2D equipe1 = new Asimov2D("c:/", 7, 10);
        AsimovSEK equipe2 = new AsimovSEK(3, 6, 6);
        ITADroids equipe3 = new ITADroids("c:/ita", 6, 8);
        Mexico equipe4 = new Mexico(1, 4, 5);

        System.out.println(equipe1.jogar(equipe3));
        System.out.println(equipe1.jogar(equipe3));
        System.out.println(equipe1.jogar(equipe3));
        System.out.println(equipe1.jogar(equipe3));

        System.out.println(equipe2.jogar(equipe4));
        System.out.println(equipe2.jogar(equipe4));
        System.out.println(equipe2.jogar(equipe4));
        System.out.println(equipe2.jogar(equipe4));
    }

}
