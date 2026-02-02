package Java.capacitaIrede2025.iRede.lista2ExerciciosPOO.cap2.parte1;

public class Main {
    public static void main(String[] args) {
        Senioridade senioridade = Senioridade.SENIOR;
        double salario = 15.800;
        String nome = "João josé Reis";
        int idade = 54;
        Escolaridade escolaridade = Escolaridade.MESTRE;

        Engenheiro engenheiro = new Engenheiro(senioridade, salario, nome, idade, escolaridade);
        Funcionario funcionario = new Funcionario(5500, "Oliver Queen", 30, Escolaridade.FUNDAMENTAL);
        //resolvi tornar a classe pessoa abstrata, com o fito de aplicar essa prática à herança;

        engenheiro.apresentar();
        funcionario.apresentar();
    }
}
