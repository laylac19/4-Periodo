/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usaclasses;

/**
 *
 * @author 1547906
 */
public abstract class Alimento {
    private double peso;
    private String validade;
    private String nome;
    private static int qtAlimento = 0;

    public Alimento(double peso, String validade, String nome) {
        this.peso = peso;
        this.validade = validade;
        this.nome = nome;
        Alimento.qtAlimento++;
    }


    public static int getQuantidade() {
        return Alimento.qtAlimento;
    }

    public double getPeso() {
        return peso;
    }

    public String getValidade() {
        return validade;
    }
    
    public String getNome(){
        return nome;
    }
    
    public abstract String getNutrientes();
}
