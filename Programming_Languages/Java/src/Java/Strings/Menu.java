package Java.Strings;

import javax.swing.*;

public class Menu {

    public static String perguntarComConfirmacao(String mensagem) {

        while (true) {
            String entrada = JOptionPane.showInputDialog(null, mensagem);

            int escolha = Integer.parseInt(
                    JOptionPane.showInputDialog("1 - Confirmar \n 2 - Corrigir \n 0 - Cancelar")
            );

            if (escolha == 1) {
                return entrada; // valor confirmado
            }
            else if (escolha == 0) {
                return null; // usuário cancelou
            }

            // se for 2, apenas repete o while
        }
    }


    public static void main(String[] args){

    Contas contas = new Contas();
//    String nome, senha, sexo;
//    int idade;
//    float saldo;
    int opcao = 1;

    while(opcao != 0) {
        opcao = Integer.parseInt(JOptionPane.showInputDialog("MENU: \n 1 - REGISTRAR \n 2 - LOGIN \n 0 - SAIR"));

        switch (opcao) {

            case 1:

                String nome = perguntarComConfirmacao("REGISTRAR\nLogin:");
                if (nome == null) {
                    JOptionPane.showMessageDialog(null, "Registro cancelado!");
                    break;
                }

                String idadeStr = perguntarComConfirmacao("REGISTRAR\nIdade:");
                if (idadeStr == null) {
                    JOptionPane.showMessageDialog(null, "Registro cancelado!");
                    break;
                }
                int idade = Integer.parseInt(idadeStr);

                String sexo = perguntarComConfirmacao("REGISTRAR\nSexo:");
                if (sexo == null) {
                    JOptionPane.showMessageDialog(null, "Registro cancelado!");
                    break;
                }

                String saldoStr = perguntarComConfirmacao("REGISTRAR\nSaldo:");
                if (saldoStr == null) {
                    JOptionPane.showMessageDialog(null, "Registro cancelado!");
                    break;
                }
                float saldo = Float.parseFloat(saldoStr);

                String senha = perguntarComConfirmacao("REGISTRAR\nSenha:");
                if (senha == null) {
                    JOptionPane.showMessageDialog(null, "Registro cancelado!");
                    break;
                }

                contas.adicionarConta(nome, idade, sexo, saldo, senha);

                JOptionPane.showMessageDialog(null,
                        "Conta criada com sucesso!\n\n" +
                                "O nº da sua conta é: " + contas.NUMEROCONTA);

                break;

//            case 1:
//                int escolha;
//                boolean cancelar = false;
//
//                while(true) {
//                    nome = JOptionPane.showInputDialog(null, "REGISTRAR \n Login:");
//                    escolha = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Confirmar \n 2 - Corrigir \n 0 - Cancelar "));
//
//                    if (escolha == 1) break;
//                    else if (escolha == 0){
//                        cancelar = true;
//                        break;
//                    }
//
//                }
//                if(cancelar){
//                    JOptionPane.showMessageDialog(null, "Registro cancelado!");
//                    break;
//                }
//
//                while(true) {
//                    idade = Integer.parseInt(JOptionPane.showInputDialog("REGISTRAR \n idade:"));
//                    escolha = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Confirmar \n 2 - Corrigir \n 0 - Cancelar "));
//
//                    if (escolha == 1) break;
//                    else if (escolha == 0){
//                        cancelar = true;
//                        break;
//                    }
//
//                }
//                if(cancelar){
//                    JOptionPane.showMessageDialog(null, "Registro cancelado!");
//                    break;
//                }
//
//                  sexo = JOptionPane.showInputDialog(null, "REGISTRAR \n Login:");
//                  saldo = Float.parseFloat(JOptionPane.showInputDialog(null, "REGISTRAR \n Saldo:"));
//                  senha = JOptionPane.showInputDialog(null, "REGISTRAR \n Senha:");
//
//                 contas.adicionarConta(nome,idade,sexo,saldo,senha);
//
//                 JOptionPane.showMessageDialog(null, "Conta criada com sucesso! \n \n O nº da sua conta é: " +
//                         contas.NUMEROCONTA + "\n \n \n - - - - - - - - - - - - - - - - - - - - - - - - - \n Use seu nº de conta para login");
//                break;

            case 2:
                String newNome, newSenha;
                newNome = JOptionPane.showInputDialog(null,"LOGIN: \n Novo login: ");
                newSenha = JOptionPane.showInputDialog(null, "LOGIN: \n Nova senha: ");
                break;

            case 0:
                JOptionPane.showMessageDialog(null, "SAINDO...");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opção inválida");

        }
    }
        //Conta Conta = new Conta(nome, senha);

    }
}
