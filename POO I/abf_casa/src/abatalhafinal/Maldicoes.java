package abatalhafinal;

//Principal das Maldições
public abstract class Maldicoes extends Ser {
    protected int ataque;
    protected String obscuro; //Nome indivíduo responsável pala criação da maldição

    public Maldicoes(int ataque, String obscuro, int codigo, String nome, double peso, double altura) {
        super(codigo, nome, peso, altura);
        this.energia = 200;
        this.ataque = ataque;
        this.obscuro = obscuro;
    }

    public int getAtaque() {
        return ataque;
    }

    public String getObscuro() {
        return obscuro;
    }
    
}

