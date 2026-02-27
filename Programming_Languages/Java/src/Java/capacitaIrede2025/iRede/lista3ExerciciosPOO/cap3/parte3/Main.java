package Java.capacitaIrede2025.iRede.lista3ExerciciosPOO.cap3.parte3;

public class Main {
    public static void main(String[] args) {

        Casa casa = new Casa();

        casa.adicionarComodo("Sala", 20.5);
        casa.adicionarComodo("Quarto", 15.0);
        casa.adicionarComodo("Cozinha", 12.0);

        casa.listarComodos();
    }
}