package AVA;
import javax.swing.JOptionPane;

//Adicionalmente, é preciso realizar o gerenciamento dos alunos, podendo: adicionar, buscar, exibir todos os alunos,
// excluir e atualizar um aluno, listar por situação e exibir relatório (aluno(os) com maior média,
// média da turma, quantidade em cada situação, entre outros).

public class Gerenciamento {
    private Aluno alunos[];
    private int qtdDeAlunos;
    static public int MATRICULA = 569782, TAMTURMA = 3;


    // Construtor
    public Gerenciamento() {
        this.alunos = new Aluno[TAMTURMA];
        this.qtdDeAlunos = 0;
    }

    // Adicionar
    public String AddAluno(String nome, int idade, int periodo, float media, char sexo, boolean situacao) {
        if (qtdDeAlunos < TAMTURMA) {
            Aluno aluno = new Aluno(nome, idade, periodo, media, sexo, situacao);
            this.alunos[this.qtdDeAlunos] = aluno;
            ++this.qtdDeAlunos;
            return "Aluno " + this.alunos[this.qtdDeAlunos - 1].getMatricula() + " adicionado!";
        }
        else return "Limite de alunos atingido!";
    }

    // Buscar
public Aluno buscarAlunoObjeto(int chave){
    if(this.qtdDeAlunos > 0) {
        for (int i = 0; i < qtdDeAlunos; i++) {
            if (chave == this.alunos[i].getMatricula()) {
                return this.alunos[i];
            }
        }
        return null;
    } else {
        JOptionPane.showMessageDialog(null, "Nenhum aluno cadastrado no sistema!");
        return null;
    }
}
// buscar interno
    private int buscarAluno(int chave) {

        for (int posicao = 0; posicao < qtdDeAlunos; posicao++) {
            if (chave == this.alunos[posicao].getMatricula()) {
                return posicao;
            }
        }
        JOptionPane.showMessageDialog(null, "Aluno não encontrado!");
        return -1;
    }

    // Exibir
    public String exibirAlunos() {
        String mensagem = "";

        if (qtdDeAlunos > 0) {
            for (int i = 0; i < this.qtdDeAlunos; i++) {
                mensagem = mensagem + this.alunos[i].toString();
            }
            return mensagem;
        } else {
            return "Nenhum aluno encontrado!";
        }
    }

    // Excluir
    public void excluirAluno(int chave) {

        if(qtdDeAlunos == 0){
            JOptionPane.showMessageDialog(null,"Não há alunos cadastrados no sistema!");
            return;
        }

        int aux = buscarAluno(chave);

        for (int j = aux; j < qtdDeAlunos - 1; j++) this.alunos[j] = this.alunos[j + 1];

        this.alunos[qtdDeAlunos - 1] = null;
        qtdDeAlunos--;
    }

    // Atualizar
    public void atualizarAluno(int chave) {
        int posicao = buscarAluno(chave);

        if (posicao == -1) {
            JOptionPane.showMessageDialog(null, "Aluno não encontrado!");
            return;
        }
        int opcao;
        do {
            //JOptionPane.showMessageDialog(null, "Menu de atualização de aluno");
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu de atualização de aluno \n Opção: \n 1 - Nome \n 2 - Idade \n 3 - Período \n 4 - Média \n 5 - Sexo \n 6 - Situação \n 0 - Voltar "));

            switch (opcao) {
                case 1:
                    String nome = JOptionPane.showInputDialog("Novo nome: ");
                    alunos[posicao].setNome(nome);
                    break;

                case 2:
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Nova idade: "));
                    alunos[posicao].setIdade(idade);
                    break;

                case 3:
                    int periodo = Integer.parseInt(JOptionPane.showInputDialog("Novo período: "));
                    alunos[posicao].setPeriodo(periodo);
                    break;

                case 4:
                    float media = Float.parseFloat(JOptionPane.showInputDialog("Nova média: "));
                    alunos[posicao].setMedia(media);
                    break;

                case 5:
                    String entrada = JOptionPane.showInputDialog("Novo sexo (M/F):");
                    if (entrada != null && !entrada.isEmpty()) {
                        char sexo = entrada.charAt(0);
                        alunos[posicao].setSexo(sexo);
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido!");
                    }
                    break;

                case 6:
                    String situacao = JOptionPane.showInputDialog("Nova Situação (Aprovado/Reprovado): ");
                    boolean novaSituacao = situacao != null && situacao.equalsIgnoreCase("aprovado");
                    alunos[posicao].setSituacao(novaSituacao);
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Atualização de " + chave + " Concluída!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida!");
            }

        } while (opcao != 0);
        JOptionPane.showMessageDialog(null, "Saindo do menu de atualização...");
    }

    // Listar alunos por situação
    public String listarAlunosSituacao(){

        String mensagem = "";
        if(this.qtdDeAlunos != 0) {
            for (int i = 0; i < this.qtdDeAlunos; i++) {
                if (alunos[i].getSituacao())
                    mensagem = mensagem + " Aluno(a) " + alunos[i].getMatricula() + " está " + " Aprovado(a) \n";
            }
            for (int i = 0; i < this.qtdDeAlunos; i++) {
                if (!alunos[i].getSituacao())
                    mensagem = mensagem + "Aluno(a) " + alunos[i].getMatricula() + " está " + " Reprovado(a) \n";
            }
        }
        else JOptionPane.showMessageDialog(null,"Não há alunos cadastrados no sistema!");
        return mensagem;
    }

    // Exibir relatório
    public String relatorio(){

        if(qtdDeAlunos == 0) return "Não há alunos cadastrados no sistema!";

        Aluno maior = alunos[0];
        float mediaTurma = 0;
        int qtdDeAlunosAp = 0, qtdDeAlunosRep = 0;

        for(int i = 0; i < qtdDeAlunos; i++){
            if(alunos[i].getmedia() > maior.getmedia()) maior = alunos[i];
            mediaTurma += alunos[i].getmedia();
            if(alunos[i].getSituacao()) ++qtdDeAlunosAp;
            else ++qtdDeAlunosRep;
        }
        return "Aluno(a) com maior média: " + maior.getMatricula() + " com " + maior.getmedia() + " \n Media da turma: " + (mediaTurma/qtdDeAlunos) +
                "\n Quantidade de alunos Aprovados: " + qtdDeAlunosAp + "\n Quantidade de alunos Reprovados: " + qtdDeAlunosRep;

    }

    public int getQtdDeAlunos() { return this.qtdDeAlunos; }

}


