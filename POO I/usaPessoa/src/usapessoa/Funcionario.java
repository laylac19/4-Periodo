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
public class Funcionario extends PessoaFisica{

    private String cartao;

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }
    
    public void imprimirNomeClasse() {
        System.out.println("Classe Funcionario");
    }
}
