package Java.capacitaIrede2025.iRede.lista3ExerciciosPOO.cap3.parte2;

public class Main {
    public static void main(String[] args) {

        Departamento d1 = new Departamento("Ciência da Computação");

        Professor p1 = new Professor("Carlos", d1);

        p1.mostrarDepartamento();

        p1 = null;

        System.out.println("Departamento ainda existe: " + d1.getNome());
    }
}
