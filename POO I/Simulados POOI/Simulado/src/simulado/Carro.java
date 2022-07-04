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
public abstract class Carro {
    private double aceleracao, dirigibilidade;
    private int velocidade_maxima, propulsao;

    @Override
    public String toString() {
        return "Aceleracao = " + aceleracao + 
                ", Velocidade Máxima = " + velocidade_maxima +
                ", Dirigibilidade = " + dirigibilidade + 
                ", Propulsao = " + propulsao + '.';
    }
    
    public Carro(double aceleracao, int velocidade_maxima,
            double dirigibilidade, int propulsao) {
        this.aceleracao = aceleracao;
        this.dirigibilidade = dirigibilidade;
        this.velocidade_maxima = velocidade_maxima;
        this.propulsao = propulsao;
    }
    
    public abstract double getPreco();
}
