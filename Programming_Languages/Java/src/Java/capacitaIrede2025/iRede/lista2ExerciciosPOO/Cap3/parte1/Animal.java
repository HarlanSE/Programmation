package Java.capacitaIrede2025.iRede.lista2ExerciciosPOO.Cap3.parte1;
/*
Unidade 2 - Capítulo 3

7. Crie uma hierarquia de classes em que exista uma classe Animal com um método
fazerSom(). Crie duas subclasses: Cachorro e Gato, que sobrescrevem esse método para
imprimir "Latindo" e "Miando", respectivamente. Em seguida, crie uma classe Teste com
o método main(), onde você instancia um array de Animal contendo objetos de
Cachorro e Gato, e percorre o array chamando fazerSom() para cada item.
*/
public class Animal{
    public Animal(){}

    public void fazerSom(){
        System.out.println("emitindo som!");
    }

}
