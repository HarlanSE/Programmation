package Java.capacitaIrede2025.iRede.lista3ExerciciosPOO.cap3.parte3;
import java.util.ArrayList;
import java.util.List;

public class Casa {
    private List<Comodo> comodos;

    public Casa() {
        // A casa cria sua própria lista de cômodos
        this.comodos = new ArrayList<>();
    }

    public void adicionarComodo(String nome, double tamanho) {
        Comodo comodo = new Comodo(nome, tamanho); // composição
        comodos.add(comodo);
    }

    public void listarComodos() {
        if (comodos.isEmpty()) {
            System.out.println("A casa não possui cômodos.");
        } else {
            System.out.println("Cômodos da casa:");
            for (Comodo c : comodos) {
                c.exibir();
            }
        }
    }
}