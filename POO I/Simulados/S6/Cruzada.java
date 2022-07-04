/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provadacruzada;

/**
 *
 * @author 2019122760168
 */
public abstract class Cruzada {
    
    protected int qtdsoldados =3000;

    protected int Forca;
    
    protected static int Qt_Cruzada;
    
    public Cruzada(int qtdsoldados) {
        this.qtdsoldados = qtdsoldados;
        Cruzada.Qt_Cruzada++;
    }

    public static int getQt_Cruzada() {
        return Qt_Cruzada;
    }

    
    
    public int getQtdsoldados() {
        return qtdsoldados;
    }

    public int getForca() {
        return qtdsoldados*10 ;
    }
    
    
    
    protected abstract String lema();
    
}
