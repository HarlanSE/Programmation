package Java.capacitaIrede2025.iRede.lista2ExerciciosPOO.Cap1;

import java.util.ArrayList;
/*
2. Crie uma classe Aluno com atributos privados nome e nota. Implemente métodos get
e set para ambos. No método setNota, adicione uma vericação para garantir que o
valor da nota esteja entre 0 e 10. Caso esteja fora desse intervalo, não permita a
alteração.
*/
public class Aluno {
    private String nome;
    private double nota;

    public Aluno(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNome(String nome){ this.nome = nome; }
    public void setNota(double nota){
        if(nota >= 0 && nota <= 10){
            this.nota = nota;
            return;
        }
        System.out.println("nota inválida, alteração não realizada.");
    }
}
