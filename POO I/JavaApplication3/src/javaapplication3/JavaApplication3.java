/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author 2020122760102
 */
public class JavaApplication3 {
    /*
    //EXEMPLO 1
    public static int[] insereValorArray(int arr[], int valor) {
        int novo_array[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            novo_array[i] = arr[i];
        }
        novo_array[arr.length] = valor;
        return novo_array;
    }
    */

    public static void main(String[] args) {
        /*    
        //EXEMPLO 1
        int n1[] = {1, 2, 3};
        int n2[] = insereValorArray(n1, 4);
        for (int i = 0; i < n2.length; i++) {
            System.out.println(n2[i]);
        }
        System.out.println("fim");
         */
        System.out.println("ArrayList");
        ArrayList als1 = new ArrayList();
        ArrayList als2 = new ArrayList(80);
        
        als1.add("1");
        als1.add("2");
        als1.add(1, "3");
        
        System.out.println(als1.get(1));
        System.out.println(als1.remove(0));
        System.out.println(als1.get(1));

        System.out.println(als1.set(0, "4"));
        
        als2.add("5");
        als2.addAll(als1);
        
        while (!als1.isEmpty()) {
            System.out.println(als1.remove(0));
        }
        ArrayList als3 = new ArrayList(als2);
        
         
        System.out.println("LinkedList");
        
        LinkedList ls1 = new LinkedList();
        ls1.add(1);
        LinkedList ls2 = new LinkedList(ls1);
        ls1.addFirst(2);
        ls1.addLast(3);
        
        System.out.println(ls1.get(1));
        Iterator it = ls1.iterator();
        
        it.remove();
        
        while (it.hasNext()) {
            System.out.println(it.next());
            it.remove();
        }
    }
}



