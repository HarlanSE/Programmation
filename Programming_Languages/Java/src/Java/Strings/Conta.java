package Java.Strings;

public class Conta {

    private String nome;
    private int idade;
    private String sexo;
    private double saldo;

    private int numeroConta;
    private String senha;

    public Conta(String nome, int idade, String sexo, double saldo, String senha){
        this.numeroConta = Contas.NUMEROCONTA;
        ++Contas.NUMEROCONTA;

        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.saldo = saldo;

        this.senha = senha;
    }

    public String getNome(){ return nome; }
    public int getIdade(){ return idade; }
    public String getSexo(){ return sexo; }
    public double getSaldo(){ return saldo; }
    public String getSenha(){ return senha; }

    public void setNome(String nome){ this.nome = nome; }
    public void setIdade(int idade) {this.idade = idade;}
    public void setSexo(String sexo) {this.sexo = sexo;}
    public void setSaldo(double saldo) {this.saldo = saldo;}
    public void setSenha(String senha){ this.senha = senha; }
}
