package Java.capacitaIrede2025.iRede.lista3ExerciciosPOO.cap3.parte2;

public class Professor {
    private String nome;
    private Departamento departamento;

    public Professor(String nome, Departamento departamento) {
        this.nome = nome;
        this.departamento = departamento;
    }

    public void mostrarDepartamento() {
        if (departamento != null) {
            System.out.println("O professor " + nome +
                    " pertence ao departamento de " +
                    departamento.getNome());
        } else {
            System.out.println("Professor sem departamento.");
        }
    }
}
