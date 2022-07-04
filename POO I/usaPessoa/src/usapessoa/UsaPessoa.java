/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usapessoa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 2020122760102
 */
public class UsaPessoa { //AULA DE POLIMORFISMO
//MAIN

    public static void main(String[] args) {
        Pessoa pessoa = null;
        BufferedReader dado;
        String s;
        try { //menu
            System.out.println( "Digite que objeto deseja criar:");
            System.out.println("1 - Pessoa");
            System.out.println("2 - Pessoa Física");
            System.out.println("3 - Pessoa Juridica");
            System.out.println("4 - Funcionário");
            
            dado = new BufferedReader(new InputStreamReader(System.in));
            s = dado.readLine();
            
            switch (Integer.parseInt(s)) {
                case 1: pessoa = new Pessoa(); break;
                case 2: pessoa = new PessoaFisica(); break;
                case 3: pessoa = new PessoaJuridica(); break;
                case 4: pessoa = new Funcionario(); break;
                default: System.out.println("tipo desconhecido"); 
            }
            //System.out.println(pessoa);
            pessoa.imprimirNomeClasse();
        }
        catch (IOException erro) {
            System.out.println("Erro na entrada de dados");
        }
        catch (NumberFormatException erro) {
            System.out.println("Digite apenas números inteiros");
        }
    }
}
        
        

