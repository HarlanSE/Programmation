package Java.I_Fundamentos_Do_Java.AUX_EstruturasDeDados.Arrays;

public class Main {
    public static void main(String[] args){

        int vetor[] = {18,1,9,33,7,2,0,5,10};

        ExercicioEmSala exercicioEmSala = new ExercicioEmSala(vetor);

        System.out.println(exercicioEmSala.exibirVetor());
        exercicioEmSala.inverterVetor();
        System.out.println(exercicioEmSala.exibirVetor());

        //Exercício 1
//        int numbers[] = {3,1,8,5};
//        String names[] = {"Dorgival Dantas", "Mayrton"};
//
//        Exercicio1 exercicio1 = new Exercicio1(numbers, names);
//
//        System.out.println("Input of array numbers: " + exercicio1.displayNumbers());
//        exercicio1.orderNumbers();
//        System.out.println("numbers lenght: " + numbers.length);
//        System.out.println("Output of array numbers: " + exercicio1.displayNumbers());



    }
}
