/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author 2020122760102
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException { //aqui
    
        FileInputStream fil = new FileInputStream("apent.txt");
        Scanner scan = new Scanner(fil);

        String s = "";
        
        while (scan.hasNext()) {
            s = s + scan.nextLine() + "\n";
        }
        scan.close();
    
        Formatter escritor = new Formatter("apent.txt");
        
        escritor.format(s);
        escritor.format(" -------- ");
        escritor.close();
    }
}
