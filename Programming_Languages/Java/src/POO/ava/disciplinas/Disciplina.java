package POO.ava.disciplinas;

import POO.ava.Aluno;

public abstract class Disciplina {
    protected Aluno[] alunos;
    protected String nomeDisc;
    protected double nota1;

    public Disciplina(double nota1){
        this.nota1 = nota1;
    }

    public abstract double calcularMedia();

}
