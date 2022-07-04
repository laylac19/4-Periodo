/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author 2020122760102
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        String frase = "Vou estudar esse modulo";
        int tamanho = frase.length();
        System.out.println("O tamanho da string: \"" + frase + "\" eh " + tamanho); 
        System.out.println("\"" + frase + "\""); 
        */
        
        /*
        int num = 2;
        char n = "AACDD".charAt(num);
        System.out.println("O caracter na posicao " + num + " eh " + n);
        */
        
        /*
        String nome = "Giovany";
        System.out.println(nome);
        System.out.println(nome.toUpperCase());
        System.out.println(nome);
        System.out.println(nome.toLowerCase());
        System.out.println(nome);
        */
        
        /*
        String frase = "O rato roeu";
        System.out.println(frase.substring(2, 6));
        System.out.println(frase.substring(6));
        */
        
        /*
        String nome = " Estados Unidos ";
        System.out.println(nome);
        System.out.println(nome.trim());
        nome = nome.trim(); //recebe ela mesma sem os espaços
        System.out.println(nome);
        System.out.println(nome.trim());
        */
        
        /*
        // retirando espaços em branco dentro de dentro da string 
        String frase1 = "Ana viva Maiana viva Mariana".replace(" ", "");
        frase1 = frase1.replace("na", "NA");
        System.out.println(frase1);
        */
        
        /*
        String x = "";
        x = x + String.valueOf(23) + String.valueOf(true) + " - ";
        x = x + String.valueOf(Math.PI);
        System.out.println(x);
        */
        
        /*
        String texto = "Linguagem de Programacao";
        char caracter = 'a';
        int indice = texto.indexOf(caracter);
        System.out.println(indice);
        indice++;
        indice = texto.indexOf(caracter, indice);
        System.out.println(indice);
        indice = texto.indexOf("acao", indice);
        System.out.println(indice);
        */
        
        
        String f1 = "abcd";
        String f2 = "abcd";
        /*
        System.out.println(frase.substring(3)+frase.substring(2,3)+frase.substring(1,2)+frase.substring(0,1));
        
        System.out.println(f2.substring(2,4) + frase.substring(1,2) + f2.substring(0,1));
        */
        
        
        int t1 = f1.length();
        int t2 = f2.length();
        
        for (int i = 0; i <= t1; i++) {
            System.out.println(f1.substring(t1--));
        }
        
        //System.out.println("O tamanho da string: \"" + frase + "\" eh " + tamanho); 
        //System.out.println("\"" + frase + "\""); 
        
        //System.out.println(frase.substring(2,3)+frase.substring(0,1));
        //System.out.println(frase.substring(1, 3));
        //System.out.println(frase.substring(2));
        
        
        
        
        
    }
}
