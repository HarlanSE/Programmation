package Java.capacitaIrede2025.iRede.lista3ExerciciosPOO.cap4.parte3;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {

        if (valor > saldo) {
            throw new SaldoInsuficienteException(
                    "Saldo insuficiente! Saldo atual: R$ " + saldo);
        }

        saldo -= valor;
        System.out.println("Saque realizado com sucesso.");
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
}