package POO.heranca.especies;

import POO.heranca.familias.Felino;

public class Gato extends Felino {
    protected String nome;

    public Gato(){
        super();
        this.nome = " ";
    }

    public Gato(String nome, String especie, String porte, int idade, double peso, double altura, String cor, String sexo){
        super(especie, porte, idade, peso, altura, cor, sexo);
        this.nome = nome;

    }

    public void emitirSom(){
        System.out.println("Mial!");
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String toString() {
        return " nome: " + this.nome + " \n especie: " + this.especie + "\n porte: "+ this.porte + "\n idade: "  + this.idade + " aa" +  "\n peso: "+ this.peso + " kg" + "\n altura: " + this.altura + " m" + "\n cor: " + this.cor + "\n sexo: "+ this.sexo;
    }
}

