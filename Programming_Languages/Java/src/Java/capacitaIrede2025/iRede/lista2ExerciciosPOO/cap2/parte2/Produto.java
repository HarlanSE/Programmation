package Java.capacitaIrede2025.iRede.lista2ExerciciosPOO.cap2.parte2;

/*
5. Crie uma hierarquia de classes em que Produto é a superclasse e ProdutoAlimenticio é
a subclasse. A subclasse deve adicionar um atributo dataValidade e um método
estaVencido() que retorna true ou false com base na data atual.
*/

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getQuantidadeEstoque() { return quantidadeEstoque; }

    public void setNome(String nome){ this.nome = nome; }
    public void setpreco(double preco){ this.preco = preco; }
    public void setQuantidadeEstoque(int quantidadeEstoque){ this.quantidadeEstoque = quantidadeEstoque; }

    public String toString(){
        return "Nome: " + this.nome + " Preço: R$ " + this.preco + " Qtdd em estoque: " + this.quantidadeEstoque;
    }

}
