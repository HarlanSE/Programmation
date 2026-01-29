package Java.Strings;

public class Contas {
    private Conta contas[];
    private int numeroContas;
    public static int NUMEROCONTA = 1000, TAM = 100;

    public Contas(){
        this.contas = new Conta[TAM];
        this.numeroContas = 0;
    }

    public void adicionarConta(String nome, int idade, String sexo, double saldo, String senha){
    Conta novaConta = new Conta(nome, idade, sexo, saldo, senha);
    contas[numeroContas] = novaConta;
    numeroContas++;
    }

   // public String exibirConta(chave){

    //}

}


