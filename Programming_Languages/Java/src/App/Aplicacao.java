package App;

import javax.swing.JOptionPane;

public class Aplicacao {
    public static void main(String[] args){
        Gerenciamento gerenciamento = new Gerenciamento();
        int opcao = 1;

        //JOptionPane.showMessageDialog(null, "Menu");

        String nome, categoria, validade;
        double preco;
        int quantidade, busca;
        Produto produto;

        while (opcao != 0){
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu\n 1 - adicionar produto\n 2 - buscar produto\n 3 - listar produtos\n 0 - sair"));
            switch (opcao){
                case 1:
                    nome = JOptionPane.showInputDialog(null,"Digite o nome do produto");
                    categoria = JOptionPane.showInputDialog(null,"Digite o nome da categoria");
                    preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do produto"));
                    validade = JOptionPane.showInputDialog(null, "Digite a validade do produto");
                    quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade do produto"));
                    gerenciamento.adicionarProduto(nome, categoria, preco, validade,quantidade);
                    break;
                case 2:
                    busca = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do produto"));
                    gerenciamento.buscarProduto(busca);
                    produto = gerenciamento.buscarProduto(busca);
                    if(produto != null){
                        JOptionPane.showMessageDialog(null, "Produto encontrado: "+produto.toString());
                    }else {
                        JOptionPane.showMessageDialog(null, "Produto não encontrado!");
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Lista de produtos\n" + gerenciamento.listarProdutos());
                default:
                    break;
            }
        }

        gerenciamento.adicionarProduto("Café", "classe_media", 7.50, "05/12/2025",  10);
        gerenciamento.adicionarProduto("Arroz", "integral", 3.70, "11/12/2025", 15);
        gerenciamento.listarProdutos();
    }
}