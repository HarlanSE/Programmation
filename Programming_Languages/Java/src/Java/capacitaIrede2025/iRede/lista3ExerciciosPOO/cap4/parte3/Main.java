package Java.capacitaIrede2025.iRede.lista3ExerciciosPOO.cap4.parte3;

public class Main {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Carlos", 1000);

        conta.exibirSaldo();

        try {
            conta.sacar(1500);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        conta.exibirSaldo();
    }
}