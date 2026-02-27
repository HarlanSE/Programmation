package Java.capacitaIrede2025.iRede.lista3ExerciciosPOO.cap3.parte3;

public class Comodo {
    private String nome;
    private double tamanho;

    public Comodo(String nome, double tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void exibir() {
        System.out.println("Cômodo: " + nome + " | Tamanho: " + tamanho + " m²");
    }
}
