package POO.app;

public class Gerenciamento {
    private Produto produtos[];
    private int id;
    static public int ID = 5000;
    private String nota = "";
    private double total = 0;

    public Gerenciamento() {
        this.produtos = new Produto[5];
        this.id = 0;

    }

    public void adicionarProduto(String nome, String categoria, double preco, String validade, int quantidade){
        if(this.id < 5){
            Produto p = new Produto(nome, categoria, preco, validade, quantidade);
            this.produtos[this.id] = p;
            ++this.id;
        }else {
            System.out.println("Quantidade máxima de produtos atingida");
        }

    }
    public String listarProdutos(){
        int i;
        String mensagem = "";
        for (i = 0; i < this.id; i++) {
            mensagem = mensagem + this.produtos[i].toString() + "\n";
        }
        return mensagem;
    }
    public Produto buscarProduto(int busca){
        int i;
        for(i = 0; i < this.id; ++i){
            if(busca == this.produtos[i].getId()){
                return this.produtos[i];
            }
        }
        return null;
    }

    public void atualizarProduto(int busca,String nome, String categoria, double preco, String validade, int quantidade) {
        for(int i = 0; i < this.id; ++i){
            if(busca == this.produtos[i].getId()){
                this.produtos[i].setNome(nome);
                this.produtos[i].setCategoria(categoria);
                this.produtos[i].setPreco(preco);
                this.produtos[i].setValidade(validade);
                this.produtos[i].setQuantidade(quantidade);
            }
        }
    }

    public void removerProduto(int busca){
        for(int i = 0; i < this.id; i++){
            if(busca == this.produtos[i].getId()){
                if (i == (this.id - 1)){
                    this.produtos[i] = null;
                }else{
                    for(int j = i; j < this.id - 1; ++j){
                        this.produtos[j] = this.produtos[j+1];
                    }
                    this.produtos[this.id - 1] = null;
                }
                --this.id;

            }
        }
    }
    public int adicionarCarrinho(int busca, int quantidade) {
        Produto p = buscarProduto(busca);

        if(p != null){
            if(p.getQuantidade() >= quantidade){
                p.setQuantidade(p.getQuantidade() - quantidade);
                this.nota = nota + "Codigo: " + p.getId() + " Nome: " + p.getNome() + " QTDE: " + p.getQuantidade() + " Preço: " + p.getPreco() + "\n";
                this.total += p.getPreco() * quantidade;
                return 1;  // produto adicionado
            }
            else {
                return 3; // quantidade insuficiente de produto
            }
        }
        return 2; // Produto não encontrado
    }

    public String exibirCompra(){
        String notaFiscal = "Nota Fiscal da compra \n\n";
        notaFiscal = notaFiscal + this.nota + "\n\n Total da compra: " + this.total;

        return notaFiscal;
    }

}