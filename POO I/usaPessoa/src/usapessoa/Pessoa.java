/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usapessoa;

import java.util.Objects;

/**
 *
 * @author 2020122760102
 */
public class Pessoa {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void imprimirNomeClasse() {
        System.out.println("Classe Pessoa");
    }

    @Override
    public String toString() {
        return ("Nome = " + this.nome);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj; //chega aqui e tem certeza que é de mesmo objeto
        if (!Objects.equals(this.nome, other.nome)) { //converte pra pessoa e pede pra pessoa o nome dela
            return false;
        }
        return true;
    }
}
