package Java.capacitaIrede2025.iRede.lista3ExerciciosPOO.cap3.parte1;

public class Motor {
    int potencia;

    public Motor(int potencia) {
        this.potencia = potencia;
    }

    public void ligar() {
        System.out.println("Motor ligado com " + potencia + " cavalos de potência.");
    }
}