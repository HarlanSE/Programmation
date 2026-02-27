package Java.capacitaIrede2025.iRede.lista3ExerciciosPOO.cap3.parte4;

public class Aluno {
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void exibir() {
        System.out.println("Aluno: " + nome);
    }
}
