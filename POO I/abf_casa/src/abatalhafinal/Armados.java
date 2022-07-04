package abatalhafinal;

/**
 *
 * @author layla
 */
public class Armados extends Feiticeiros {

    public Armados(int ataque, int qtdeArmas, String regiao, int codigo, String nome, double peso, double altura) {
        super(ataque, qtdeArmas, regiao, codigo, nome, peso, altura);
        this.ataque = 5 * (this.qtdeArmas); //a energia de ataque é multiplicada pela qtde de armas dele

    }   
}
