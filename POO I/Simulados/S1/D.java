/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulado;

/**
 *
 * @author giovanyfrossard
 */
public abstract class D extends Carro{
    private static int qtD = 0;

    public static int getQtD() {
        return qtD;
    }
    
    public D(double aceleracao, int velocidade_maxima, 
            double dirigibilidade, int propulsao) {
        super(aceleracao, velocidade_maxima, dirigibilidade, propulsao);
        D.qtD++;
    }
}
