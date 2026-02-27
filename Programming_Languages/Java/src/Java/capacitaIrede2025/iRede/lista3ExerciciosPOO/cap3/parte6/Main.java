package Java.capacitaIrede2025.iRede.lista3ExerciciosPOO.cap3.parte6;

public class Main {
    public static void main(String[] args) {

        Veiculo v1 = new Bicicleta("Caloi", 2022);
        Veiculo v2 = new Carro("Toyota Corolla", 2023);

        v1.exibirInformacoes();
        v1.mover();

        System.out.println();

        v2.exibirInformacoes();
        v2.mover();
    }
}