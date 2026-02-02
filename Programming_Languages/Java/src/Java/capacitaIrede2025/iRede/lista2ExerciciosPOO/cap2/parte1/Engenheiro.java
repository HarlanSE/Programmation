package Java.capacitaIrede2025.iRede.lista2ExerciciosPOO.cap2.parte1;

public class Engenheiro extends Funcionario{
    private Senioridade senioridade;

    public Engenheiro(Senioridade senioridade, double salario, String nome, int idade, Escolaridade escolaridade){
        super(salario, nome, idade, escolaridade);
        this.senioridade = senioridade;
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, eu sou " + getNome() + " trabalho como engenheiro, sou " + getSenioridade()  + " e tenho " + getIdade() + " anos");
    }

    public Senioridade getSenioridade() {return senioridade;}
    public void setSenioridade(Senioridade senioridade) {this.senioridade = senioridade;}
}
