/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulado5;

/**
 *
 * @author layla
 */
public class Matematica extends Exatas{

    public Matematica(String ementa, String conteudo) {
        super("Números", "123 456");
    }

    
    @Override
    public String getLema() {
        return "No meu universo tudo é exato";
    }
    
}
