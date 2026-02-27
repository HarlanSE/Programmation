package Java.capacitaIrede2025.iRede.lista3ExerciciosPOO.cap3.parte6;

public class Bicicleta extends Veiculo {

    public Bicicleta(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public void mover() {
        System.out.println("A bicicleta está sendo movida com pedaladas.");
    }
}