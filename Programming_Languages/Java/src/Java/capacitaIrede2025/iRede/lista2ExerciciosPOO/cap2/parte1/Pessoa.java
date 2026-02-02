package Java.capacitaIrede2025.iRede.lista2ExerciciosPOO.cap2.parte1;

/*
Unidade 2 - Capítulo 2

4. Implemente uma hierarquia de classes com 3 níveis: Pessoa -> Funcionário ->
Engenheiro. Cada classe deve possuir ao menos um atributo e um método. Demonstre a
criação de um objeto Engenheiro e a chamada de métodos das 3 classes.
*/

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected Escolaridade escolaridade;

    public Pessoa(String nome, int idade, Escolaridade escolaridade){
        this.nome = nome;
        this.idade = idade;
        this.escolaridade = escolaridade;
    }

    public abstract void apresentar();

    public String getNome() {return nome;}
    public int getIdade() {return idade;}
    public Escolaridade getEscolaridade() {return escolaridade;}

    public void setNome(String nome) {this.nome = nome;}
    public void setIdade(int idade) {this.idade = idade;}
    public void setEscolaridade(Escolaridade escolaridade) {this.escolaridade = escolaridade;}
}