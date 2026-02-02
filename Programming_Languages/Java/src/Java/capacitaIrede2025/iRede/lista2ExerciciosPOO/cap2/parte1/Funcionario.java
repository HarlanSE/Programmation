package Java.capacitaIrede2025.iRede.lista2ExerciciosPOO.cap2.parte1;

public class Funcionario extends Pessoa{
    protected double salario;

    public Funcionario(double salario, String nome, int idade, Escolaridade escolaridade){
        super(nome, idade, escolaridade);
        this.salario = salario;
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, eu sou " + getNome() + " trabalho como funcionário e tenho " + getIdade() + " anos.");
    }

    public double getSalario() {return salario;}
    public void setSalario(double salario) {this.salario = salario;}
}
