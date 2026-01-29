package Java.I_Fundamentos_Do_Java.AUX_EstruturasDeDados.Arrays;

//1. Sort numeric and string arrays
//Write a Java program to sort a numeric array and a string array.

public class Exercicio1 {
    private int numbers[];
    private String names[];
    // quando a var não tem modificador de acesso ela é considerada protect;

    public Exercicio1 (int numbers[], String names[]){
        this.numbers = numbers;
        this.names = names;
    }

    public void orderNumbers(){
        int aux, i;

        for(i = 0 ; i < this.numbers.length - 1 ; i++){ //itera por todo o array;
            if(this.numbers[i] > this.numbers[i+1]){ // se o número da posição i > n da posição i + 1;
                aux = this.numbers[i]; // aux = n de i que é maior que n de i + 1;
                this.numbers[i] = this.numbers[i+1]; // a posição i recebe n de i + 1 que é menor que n de i
                this.numbers[i+1] = aux; // a posição  i + 1 recebe n de i que está armazenado em aux que é maior que n de i
            }
        }
    }

    public void orderLetters(){

    }

    public String displayNumbers() {
        String s = "";
        for (int i : this.numbers) { s += i + " "; }

        return s;
    }

}
