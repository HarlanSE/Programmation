package POO.exercicioemlab2611;

public class Main {
    public static void main(String[] args) {
        Palavra string = new Palavra("UFC Russas 2025.2 Engenharia de Software");

        System.out.println("quantidade de palavras:" + string.contarPalavras());

        String[] aux = string.retornarPalavras();

        System.out.println(aux.length);

        for(int i = 0; i < aux.length; i++){
            System.out.println(aux[i] + " ");
        }

    }
}
