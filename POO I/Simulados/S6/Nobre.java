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
public class Nobre extends Cruzada {
    private int naonobre;
    private int nobre;

    public Nobre(int qtdsoldados,int nobre) {
        super(qtdsoldados);
        this.nobre = nobre;
        this.naonobre= super.getQtdsoldados()- nobre;
    }


    public int getNaonobre() {

    
        return naonobre;
        
    }

    public int getNobre() {
        return nobre;
    }

   
        
    public int getForca() {
        
        return  (naonobre*10)+nobre*20;
    }

    
    @Override
    protected String lema() {
         return"Cruzada forte tem de ter nobres";
   
    }
    
    
    
    
}
