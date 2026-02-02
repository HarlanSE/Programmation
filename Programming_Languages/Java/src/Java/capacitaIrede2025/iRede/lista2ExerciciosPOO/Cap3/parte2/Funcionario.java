package Java.capacitaIrede2025.iRede.lista2ExerciciosPOO.Cap3.parte2;
/*
8. Crie uma classe Funcionario com o método double calcularSalario(). Depois, crie duas
subclasses: FuncionarioCLT e FuncionarioPJ, cada uma com sua própria implementação
do cálculo do salário. Na classe Teste, crie uma lista de funcionários com tipos mistos
(CLT e PJ), percorra a lista e imprima o salário de cada um utilizando polimorsmo.
*/

public abstract class Funcionario {

    protected String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public abstract double calcularSalario();

    public String getNome() { return nome; }
}
