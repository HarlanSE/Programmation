package Java.capacitaIrede2025.iRede.lista2ExerciciosPOO.cap2.parte1;

/*
6. Implemente uma classe Funcionario com os atributos nome e salario. Crie uma
subclasse Gerente que, além dos atributos herdados, possua um atributo
departamento. Use um construtor com super para inicializar os atributos da superclasse.
*/

public class Gerente extends Funcionario {
    String departamento;
    public Gerente(String departamento, double salario, String nome, int idade, Escolaridade escolaridade) {
        super(salario, nome, idade, escolaridade);
        this.departamento = departamento;
    }

}
