package Java.capacitaIrede2025.iRede.lista3ExerciciosPOO.cap3.parte1;

public class Carro {
    private Motor motor;

    public Carro(int potenciaMotor) {
        // O carro cria o próprio motor
        this.motor = new Motor(potenciaMotor);
    }

    public void ligarCarro() {
        if (motor == null) {
            System.out.println("O carro não pode funcionar sem motor.");
        } else {
            System.out.println("Carro ligado.");
            motor.ligar();
        }
    }
}
