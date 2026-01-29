package POO.ava.disciplinas;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected char sexo;

    public Pessoa(String nome, int idade,  char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome(){ return this.nome; }
    public int getidade(){ return this.idade; }
    public char getSexo(){ return this.sexo; }

    public void setNome(String nome){ this.nome = nome; }
    public void setIdade(int idade) { this.idade = idade; }
    public void setSexo(char sexo) { this.sexo = sexo; }
}
