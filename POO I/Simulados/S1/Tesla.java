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
public class Tesla extends D{

    public Tesla(double aceleracao, int velocidade_maxima, 
            double dirigibilidade, int propulsao) {
        super(aceleracao, velocidade_maxima, dirigibilidade, propulsao);
    }

    @Override
    public double getPreco() {
        return 60000;
    }
}
