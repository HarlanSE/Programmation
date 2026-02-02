package Java.capacitaIrede2025.iRede.lista2ExerciciosPOO.Cap1;

/*
3. Crie uma classe Produto com atributos nome, preco e quantidadeEstoque. Garanta
que apenas métodos setters possam alterar os valores de preco e quantidadeEstoque.
Em seguida, instancie um produto e altere seus valores utilizando os setters.
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
