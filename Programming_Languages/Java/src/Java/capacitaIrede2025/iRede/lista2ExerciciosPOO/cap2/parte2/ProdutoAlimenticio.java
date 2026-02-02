package Java.capacitaIrede2025.iRede.lista2ExerciciosPOO.cap2.parte2;

/*
5. Crie uma hierarquia de classes em que Produto é a superclasse e ProdutoAlimenticio é
a subclasse. A subclasse deve adicionar um atributo dataValidade e um método
estaVencido() que retorna true ou false com base na data atual.
*/

import java.util.Calendar;

public class ProdutoAlimenticio extends Produto {

    private int anoValidade;
    private int mesValidade;

    public ProdutoAlimenticio(int anoValidade, int mesValidade,
                              String nome, double preco, int quantidadeEstoque) {
        super(nome, preco, quantidadeEstoque);
        this.anoValidade = anoValidade;
        this.mesValidade = mesValidade;
    }

    public boolean estaVencido() {
        Calendar hoje = Calendar.getInstance();
        int anoAtual = hoje.get(Calendar.YEAR);
        int mesAtual = hoje.get(Calendar.MONTH) + 1; // meses vão de 0 a 11

        if (anoAtual > anoValidade) { return true; }

        if (anoAtual == anoValidade && mesAtual > mesValidade) { return true; }

        return false;
    }
}