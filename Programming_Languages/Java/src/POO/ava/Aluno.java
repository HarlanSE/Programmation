package POO.ava;
//Model

//Cada classe: [aluno] deve possuir Atributos: [nome, matricula, idade, média, período, sexo(M/F))
// situação (aprovado, final e reprovado) ], entre outros.

import POO.ava.disciplinas.Pessoa;

public class Aluno extends Pessoa{
    private int matricula;
    private int periodo;
    private float media;
    private boolean situacao;

    //construtor
    public Aluno(String nome, int idade, int periodo, float media, char sexo, boolean situacao) {
        super(nome, idade, sexo);
        this.matricula = Gerenciamento.MATRICULA;
        ++Gerenciamento.MATRICULA;
        this.periodo = periodo;
        this.media = media;
        this.situacao = situacao;
    }

    //Gets

    public int getMatricula(){ return this.matricula; }
    public int getPeriodo(){ return this.periodo; }
    public float getmedia(){ return this.media; }
    public boolean getSituacao(){ return this.situacao; }

    //sets
    public void setMatricula(int matricula) { this.matricula = matricula; }
    public void setPeriodo(int periodo) { this.periodo = periodo; }
    public void setMedia(float media) { this.media = media; }
    public void setSituacao(boolean situacao) { this.situacao = situacao; }

    public String toString(){
        String situacao;
        if(this.situacao){
            situacao = "Aprovado(a)";
        } else {
             situacao = "Reprovado(a)";
        }

        return " Nome: " + super.nome + " Matricula: " + this.matricula + " Idade: " + super.idade + " Periodo: " + this.periodo + " Média: " + this.media + " Sexo: " + super.sexo + " Situacao: " + situacao + "\n";
    }
}