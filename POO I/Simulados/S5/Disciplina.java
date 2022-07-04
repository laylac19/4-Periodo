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
public abstract class Disciplina {
    private static String lema;
    private static int qtDisciplinas;
    
    private String ementa;
    private String conteudo;

    public Disciplina(String ementa, String conteudo) {
        this.ementa = ementa;
        this.conteudo = conteudo;
        Disciplina.qtDisciplinas++;
    }

    public abstract String getLema();
    
    public String getEmenta() {
        return ementa;
    }

    public String getConteudo() {
        return conteudo;
    }
    
    public static int getQtDisciplinas() {
        return Disciplina.qtDisciplinas;
    }
}
