/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

public class JavaApplication4 {

    public static void main(String[] args) {
        Prato p = new Prato("Bife", "Romeu");
        Cliente c = new Cliente("Joao", p);
        System.out.println("O nome do prato de " + c.getNome() + " é " + c.getPrato().getNome());
    }
}
