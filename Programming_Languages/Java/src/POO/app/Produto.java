package POO.app;

public class Produto {
    private int id;
    private String nome;
    private String categoria;
    private double preco;
    private String validade;
    private int quantidade;

    public Produto(String nome, String categoria, double preco, String validade, int quantidade) {
        this.id = Gerenciamento.ID;
        ++Gerenciamento.ID;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.validade = validade;
        this.quantidade = quantidade;
    }

    //getters
    public int getId(){ return id; }
    public String getNome(){ return nome; }
    public String getCategoria(){ return categoria; }
    public double getPreco() { return preco; }
    public  String getValidade(){ return validade; }
    public int getQuantidade(){ return quantidade; }

    //setters
    public void setId(int id){ this.id = id; }
    public void setNome(String nome){ this.nome = nome; }
    public void setCategoria(String categoria){ this.categoria = categoria; }
    public void setPreco(double preco){ this.preco = preco; }
    public void setValidade(String validade){ this.validade = validade; }
    public void setQuantidade(int quantidade){ this.quantidade = quantidade; }

    public String toString(){
        return "Id: " + this.id + " Nome: " + this.nome + " Categoria: " + this.categoria + " Preco: " + this.preco + " Validade: " + this.validade + " Quantidade: " + this.quantidade;
    }
}