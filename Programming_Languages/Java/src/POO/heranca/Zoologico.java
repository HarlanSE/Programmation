package POO.heranca;

import POO.heranca.especies.Cachorro;
import POO.heranca.especies.Gato;
import POO.heranca.especies.Tigre;
import POO.heranca.familias.Felino;

public class Zoologico {
    public static void main(String[] args) {

        Animais zoologico[] = new Animais[5];

        zoologico[0] = new Animais();
        zoologico[1] = new Felino();
        zoologico[2] = new Tigre();
        zoologico[3] = new Gato();
        zoologico[4] = new Cachorro();

        for(Animais animais : zoologico ){
            animais.emitirSom();
        }

        String nome, especie, porte, cor , sexo ;
        int idade ;
        double peso, altura ;

        Tigre tigreUm = new Tigre(nome = "Tailung", especie = "Tigre de Bengala", porte = "Grande", idade = 10, peso = 560, altura = 2, cor = "mesclado(a)" , sexo = "Masculino");
        Gato gatoP = new Gato(nome = "Marinete", especie = "Persa", porte = "Pequeno", idade = 5, peso = 0.15, altura = 0.20, cor = "Preto(a)" , sexo = "Feminino");

       // System.out.println("<<<"+ tigreUm.especie + ">>> \n" + tigreUm.toString());
       // tigreUm.emitirSom();


    }
}
