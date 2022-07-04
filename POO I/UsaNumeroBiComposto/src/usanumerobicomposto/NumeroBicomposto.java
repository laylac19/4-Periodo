/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usanumerobicomposto;

/**
 *
 * @author 2020122760102
 */
public class NumeroBicomposto {
        
    int par, impar;

    private void setPar(int numero) throws ImparException {
        if ((numero % 2) != 0) {
            throw new ImparException();
        }
        this.par = numero;
    }
    
    private void setImpar(int numero) throws ParException {
        if ((numero % 2) == 0) {
            throw new ParException();
        }
        this.impar = numero;
    }
    
    NumeroBicomposto (int par, int impar) throws ParException, ImparException {
        this.setPar(par);
        this.setImpar(impar);
    }
}
