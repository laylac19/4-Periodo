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
public class UsaNumeroBiComposto {

    public static void main(String[] args) {
        
        NumeroBicomposto num1;
        
        try {
            num1 = new NumeroBicomposto(10, 16);
        } 
        catch (ParException ex) {
            System.out.println(ex.getMessage());
        } 
        catch (ImparException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
