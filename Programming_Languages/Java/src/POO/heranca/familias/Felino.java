package POO.heranca.familias;

import POO.heranca.Animais;

public class Felino extends Animais {
    protected String especie;
    protected String porte;

    public Felino(){
        super(); //chama o construtor da Super Classe
        this.especie = " ";
        this.porte = " ";
    }

    public Felino(String especie, String porte, int idade, double peso, double altura, String cor, String sexo){
        super(idade, peso, altura, cor, sexo); //chama o construtor da Super Classe
        this.especie = especie;
        this.porte = porte;
    }

    public void emitirSom(){
        System.out.println("Garfield miou!");
    }

    public String getEspecie() { return this.especie; }
    public String getPorte() { return this.porte; }

    public void setEspecie(String especie) { this.especie = especie; }
    public void setPorte(String porte){this.porte = porte;}

}
