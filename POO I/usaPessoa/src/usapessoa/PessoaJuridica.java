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
public class PessoaJuridica  extends Pessoa{

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public void imprimirNomeClasse() {
        System.out.println("Classe Pessoa Juridica");
    }

}
