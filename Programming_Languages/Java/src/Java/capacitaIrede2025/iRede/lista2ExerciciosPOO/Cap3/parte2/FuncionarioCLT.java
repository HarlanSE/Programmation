package Java.capacitaIrede2025.iRede.lista2ExerciciosPOO.Cap3.parte2;

public class FuncionarioCLT extends Funcionario {

    private double salarioBase;

    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 0.9; // exemplo: desconto de 10%
    }
}

