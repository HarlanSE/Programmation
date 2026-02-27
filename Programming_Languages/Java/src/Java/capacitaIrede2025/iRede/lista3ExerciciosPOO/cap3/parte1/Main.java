package Java.capacitaIrede2025.iRede.lista3ExerciciosPOO.cap3.parte1;

public class Main {
    public static void main(String[] args) {

        //carro com motor 150 cavalos
        Carro carro = new Carro(150);
        carro.ligarCarro();

        // simulando carro sem motor
        Carro carroSemMotor = new Carro(0);
        carroSemMotor = null;

        System.out.println("Se o carro não existir, o motor não existe.");
    }
}
