package abatalhafinal;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    
    private static List getFeticeiros(String arqFeiticeiros) throws FileNotFoundException, IOException {
        int qtde = -1;
        
        Object Feiticeiros;
        int cod;
        String name = null;
        double weight = 0;
        double height = 0;
        int qtdeArmas = 0;
        String region = null;
        
        List sorcerers = null;
        
        try (FileReader arqF = new FileReader(arqFeiticeiros)) {
            
            Scanner line = new Scanner(arqF);
            
            if (line.hasNext()) {
                qtde = line.nextInt();
                sorcerers = new ArrayList(qtde);
            }
            
            if (qtde > 0) {
                int count = 0;
                while (line.hasNext()) {
                    cod = line.nextInt();
                    Feiticeiros = null;
                    
                    switch (cod) {
                        case 1:
                            Feiticeiros = new Trocadores(20, qtdeArmas, region, 1, name, weight, height);
                            break;
                        
                        case 2:
                            Feiticeiros = new Criadores(10, qtdeArmas, region, 2, name, weight, height);
                            break;
                        
                        case 3:
                            Feiticeiros = new Armados(5, qtdeArmas, region, 3, name, weight, height);
                            break;
                        
                        case 4:
                            Feiticeiros = new Devastadores(50, qtdeArmas, region, 4, name, weight, height);
                            break;
                        
                        default:
                            break;
                    }
                    sorcerers.add(Feiticeiros);
                    count++;
                }
            }
            arqF.close();
        }
        catch (IOException ex) {
            Logger.getLogger(Ser.class.getName()).log(Level.SEVERE, null, ex);

        }
        return sorcerers;
    }

    private static List getMaldicoes(String arqMaldicoes) {
        int qtde = -1;
        
        Object Maldicoes;
        int cod;
        String obscuro = null;
        String name = null;
        double weight = 0;
        double height = 0;
        
        List curses = null;
        
        try (FileReader arqM = new FileReader(arqMaldicoes)) {
            
            Scanner line = new Scanner(arqM);
            
            if (line.hasNext()) {
                qtde = line.nextInt();
                curses = new ArrayList(qtde);
            }
            
            if (qtde > 0) {
                int count = 0;
                while (line.hasNext()) {
                    cod = line.nextInt();
                    Maldicoes = null;
                    
                    switch (cod) {
                        case 1:
                            Maldicoes = new Basicas(3, obscuro, 1, name, weight, height);
                            break;
                        
                        case 2:
                            Maldicoes = new Copiadores(0, obscuro, 2, name, weight, height);
                            break;
                        
                        case 3:
                            Maldicoes = new Resistentes(25, obscuro, 3, name, weight, height);
                            break;
                        
                        case 4:
                            Maldicoes = new Dedos_De_Sukuna(0, obscuro, 4, name, weight, height);
                            break;
                        
                        case 5:
                            Maldicoes = new Sukunas(60, obscuro, 5, name, weight, height);
                            break;
                        
                        default:
                            break;
                    }
                    curses.add(Maldicoes);
                    count++;
                }
            }
            arqM.close();
        }
        catch (IOException ex) {
            Logger.getLogger(Ser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return curses;    
    }
    
    public int getRandomElement(List<Integer> list) {
        Random indice = new Random();
        return list.get(indice.nextInt(list.size()));
    }
    

    public static void main(String[] args) throws IOException {
        
        String arqFeiticeiros = "Feiticeiros.txt";
        String arqMaldicoes = "Maldicoes.txt";
        
        List serFeiticeiros = getFeticeiros(arqFeiticeiros);
        List serMaldicoes = getMaldicoes(arqMaldicoes);
        
        System.out.println(serFeiticeiros);
        System.out.println(serMaldicoes);
    }
}
