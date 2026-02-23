package Java.capacitaIrede2025.iRede.lista2ExerciciosPOO.Cap1;

/*
Unidade 2 - Capítulo 1
1. Crie uma classe ContaBancaria com os atributos privados numero, titular e saldo.
Implemente getters e setters, garantindo que o saldo não possa ser alterado
diretamente (não crie setSaldo). Em vez disso, crie os métodos depositar() e sacar() para
modicar o saldo.

*/

public class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;
    private static int geradorDeNumero = 246810;

    public ContaBancaria(String titular){
        this.titular = titular;
        this.numero = geradorDeNumero++;
    }

    public void depositar(double deposito){ this.saldo += deposito; }
    public void sacar(double saque){ this.saldo -= saque; }

    //setters
    public void setNumero(int numero) { this.numero = numero; }
    public void setTitular(String titular) { this.titular = titular; }

    //getters
    public int getNumero(){ return this.numero; }
    public String getTitular(){ return this.titular; }
    public double getSaldo(){ return this.saldo; }

}
