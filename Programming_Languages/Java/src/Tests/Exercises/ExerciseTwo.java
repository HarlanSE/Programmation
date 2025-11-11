package Tests.Exercises;

import java.util.Scanner;

//. Fazer um programa que imprima a média aritmética dos números 8,9 e 7.
// A média dos números 4, 5 e 6. A soma das duas médias. A média das médias.

public class ExerciseTwo {
    float[] notes;

    // generic constructor
    public ExerciseTwo(){
        Scanner collect = new Scanner(System.in);

        System.out.println("Nota 0");
        this.notes[0] = collect.nextFloat();

//        for(int i = 0; i < 6; i++){
//            System.out.printf("Nota %d: ", i);
//            this.notes[i] = collect.nextFloat();
//        }
//

    }

    public void printMedia(){
        float media = 0, media2 = 0;

        for(int j = 0; j < 3; j++){
            media += this.notes[j];
            media2 += this.notes[j+3];
        }
    }
}
