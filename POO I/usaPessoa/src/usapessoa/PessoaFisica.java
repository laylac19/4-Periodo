/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usapessoa;

/**
 *
 * @author 2020122760102
 */
public class PessoaFisica extends Pessoa {

    private String rg;

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public void imprimirNomeClasse() {
        System.out.println("Classe Pessoa Fisica");
    }

    @Override
    public String toString() {
        return (super.toString() + "RG = " + this.rg); //complementa a ação de Pessoa
    }

}
