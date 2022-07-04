package abatalhafinal;

public abstract class Feiticeiros extends Ser {
    protected int ataque;
    protected int qtdeArmas;
    protected String regiao;

    //construtor

    public Feiticeiros(int ataque, int qtdeArmas, String regiao, int codigo, String nome, double peso, double altura) {
        super(codigo, nome, peso, altura);
        this.ataque = 100;
        this.qtdeArmas = qtdeArmas;
        this.regiao = regiao;
    }
    // public abstract void atacar();
}