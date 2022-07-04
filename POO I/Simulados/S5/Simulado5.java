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
public class Simulado5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Disciplina d1 = new Matematica("Limites", "Limites, Derivadas");
        // Quando a disciplina é Matematica sem parâmetros, a ementa = "Números"
        // e conteúdo programático = "123 456" Disciplina d2 = new Matematica();
        Disciplina d3 = new Filosofia("Pensar", "Pense fora da caixa");

        System.out.println("O lema é " + d3.getLema());
        Disciplina d4 = new Biologia("Animais", "Patos, gansos, cachorros e pardais");
        // Será impresso "Biologia tem ementa = Animais e conteúdo programático =
        // Patos, gansos, cachorros e pardais

        System.out.println(d4);
        // Será impresso "Filosofia tem ementa = Pensar e conteúdo progrmático =
        // Pense fora da caixa

        System.out.println(d3);

        //System.out.println("Mais lemas " + d1.getLema() + ", " + d2.getLema());
        System.out.println("Foram criadas " + Disciplina.getQtDisciplinas() + " disciplinas");
    }
}
