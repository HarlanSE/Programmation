package Java.capacitaIrede2025.iRede.lista2ExerciciosPOO.Cap3.parte1;

public class Teste {
    public static void main(String[] args) {
        Animal[] animais = {new Animal(), new Cachorro(), new Gato()};

        for(Animal animal : animais){
            animal.fazerSom();
        }
    }
}
