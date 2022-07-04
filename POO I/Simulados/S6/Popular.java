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
public class Popular extends Cruzada{

    private int mulheres;

    private int velhos;

    private int criancas;

    public Popular( int qtdsoldados,int mulheres, int velhos, int criancas) {
        super(qtdsoldados);
        this.mulheres = mulheres;
        this.velhos = velhos;
        this.criancas = criancas;
    }

    public int getMulheres() {
        return 1500;
    }

    public int getVelhos() {
        return 500;
    }

    public int getCriancas() {
        return 2000;
    }
    
  
     protected String lema() {
         return"Viver é preciso, mas faltam recursos";
   
    }
    
    public int getForca() {
        return super.getForca()+(mulheres*3)+(velhos*2)+(criancas*1);
    }
    
    
    
    
    
}
