package Java.capacitaIrede2025.iRede.lista3ExerciciosPOO.cap3.parte6;

public class Carro extends Veiculo {

    public Carro(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public void mover() {
        System.out.println("O carro está se movendo com o motor.");
    }
}
