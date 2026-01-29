package POO.excessoes;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected int cpf;

    public Pessoa(){
        this.nome = " ";
        this.idade = 0;
        this.cpf = 0;
    }

    public Pessoa(String nome, int idade, int cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome(){ return this.nome; }
    public int getIdade(){ return this.idade; }
    public int getCpf(){ return this.cpf; }

    public void serNome(String nome){ this.nome = nome; }
    public void setIdade(int idade) { this.idade = idade; }
    public void setCpf(int cpf) { this.cpf = cpf; }


}
