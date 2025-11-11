package AVA;
import javax.swing.JOptionPane;

public class AvaApp {
    public static void main(String[] args){
        AVA.Gerenciamento gerenciamento = new Gerenciamento();
        int opcao = 1;

        String nome;
        int matricula, chave, periodo, idade;
        float media;
        char sexo = ' ';
        boolean situacao;
        Aluno aluno;

        gerenciamento.AddAluno("Fulano", 40, 5, 10,'M',true);
        gerenciamento.AddAluno("Sicrano", 30, 2, 5,'F',true);
        gerenciamento.AddAluno("Deltrano", 20, 42, 2,'M',false);

        while (opcao != 0){
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu \n 1 - Adicionar aluno \n 2 - Buscar aluno \n 3 - Exibir alunos \n 4 - Excluir aluno \n 5 - Atualizar aluno \n 6 - Listar alunos por situação \n 7 - Relatório \n 0 - Sair"));

            switch (opcao){
                case 1:
                    nome = JOptionPane.showInputDialog(null,"Digite o nome do aluno: ");
                    idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno: "));
                    periodo = Integer.parseInt(JOptionPane.showInputDialog("Digite o periodo do aluno: "));
                    media = Float.parseFloat(JOptionPane.showInputDialog("Digite a média do aluno: "));

                    String entrada = JOptionPane.showInputDialog("digite o sexo do aluno (M/F):");
                    if (entrada != null && !entrada.isEmpty()) {
                        sexo = Character.toUpperCase(entrada.charAt(0));
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido!");
                    }

                    String novaSituacao = JOptionPane.showInputDialog("Digite a situação (Aprovado/Reprovado): ");
                    situacao = novaSituacao != null && novaSituacao.equalsIgnoreCase("aprovado");

                    JOptionPane.showMessageDialog(null,gerenciamento.AddAluno(nome, idade, periodo, media, sexo, situacao));
                    break;

                case 2:
                    chave = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a matrícula do aluno: "));
                    gerenciamento.buscarAlunoObjeto(chave);
                    aluno = gerenciamento.buscarAlunoObjeto(chave);
                    if(aluno != null){
                        JOptionPane.showMessageDialog(null, "Aluno encontrado \n " + aluno.toString());
                    }else {
                        JOptionPane.showMessageDialog(null, "Aluno não encontrado!");
                    }
                    break;

                case 3:
                    if(gerenciamento.getQtdDeAlunos() != 0) {
                        JOptionPane.showMessageDialog(null, "Lista de Alunos \n" + gerenciamento.exibirAlunos());
                    } else JOptionPane.showMessageDialog(null,"Lista de alunos vazia!");

                    break;

                case 4:
                    chave = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a matrícula do aluno: "));
                    aluno = gerenciamento.buscarAlunoObjeto(chave);
                    JOptionPane.showMessageDialog(null,"Excluindo aluno " + aluno.getNome());
                    gerenciamento.excluirAluno(chave);
                    break;

                case 5:
                    chave = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a matrícula do aluno: "));
                    gerenciamento.atualizarAluno(chave);
                    break;

                case 6:
                    JOptionPane.showMessageDialog(null,gerenciamento.listarAlunosSituacao());
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Relatório \n" + gerenciamento.relatorio());
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null,"Saindo do menu...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida!");
                    break;
            }
        }

        //Implemente um código em Java para realizar o controle de alunos de uma escola.
        // Criar um menu possibilitando que o usuário consiga interagir com o sistema.

    }
}
