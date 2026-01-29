package POO.excessoes;

public class Exercito {
    private Pessoa[] alistadas;
    private final static int QTDD = 20;
    private static int POS = 0;

    public Exercito() {
        alistadas = new Pessoa[QTDD];
    }

    public void adicionarPessoa(Pessoa p){
        alistadas[POS] = p;
        ++POS;
    }

}
