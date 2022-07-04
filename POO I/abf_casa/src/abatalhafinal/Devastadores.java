package abatalhafinal;

public class Devastadores extends Feiticeiros {

    public Devastadores(int ataque, int qtdeArmas, String regiao, int codigo, String nome, double peso, double altura) {
        super(ataque, qtdeArmas, regiao, codigo, nome, peso, altura);
        this.ataque = 50;
    }
    
    //habilidade = ATAQUE FATAL
        //a cada 3 ataques gera o ataque final 
        //a maldição VAI MORRER
    
    //habilidade 2
        //antes de atagar life aumenta 20
        //nao passa de 100;
}
