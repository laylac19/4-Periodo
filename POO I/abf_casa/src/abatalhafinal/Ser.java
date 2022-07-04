/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abatalhafinal;

public abstract class Ser { //o qualificador define a visibilidade 
    
    //todo ser tem essas características
    protected int codigo;
    protected String nome;
    protected double peso;
    protected double altura;
    protected int energia = 0; //life
    
    
    //construtor
    public Ser(int codigo, String nome, double peso, double altura) {
        this.codigo = codigo;
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public int getEnergia() {
        return energia;
    }
}

    
    