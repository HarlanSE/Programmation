package Java.capacitaIrede2025.iRede.lista2ExerciciosPOO.Cap3.parte2;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new FuncionarioCLT("Robert Downey Jr", 1518));
        funcionarios.add(new FuncionarioPJ("Caravaggio", 45, 515));
        funcionarios.add(new FuncionarioCLT("Buonarroti", 32070));
        funcionarios.add(new FuncionarioPJ("Da vinci", 100, 2380));

        for(Funcionario func : funcionarios){
            System.out.println(func.getNome() + " recebe " + func.calcularSalario());
        }
        
    }
}
