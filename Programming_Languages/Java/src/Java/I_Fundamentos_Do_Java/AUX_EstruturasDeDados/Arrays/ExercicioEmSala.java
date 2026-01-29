package Java.I_Fundamentos_Do_Java.AUX_EstruturasDeDados.Arrays;
// Criar uma função que inverta arrays de inteiros.

public class ExercicioEmSala {

    private int vetor[];

    public ExercicioEmSala(int vetor[]){
        this.vetor = vetor;
    }

    public String exibirVetor(){
        String string = "";

        for(int i = 0; i < this.vetor.length; i++){
            string +=  this.vetor[i];
            string += ",";
        }
        return string;
    }

    public void inverterVetor(){
        int tam = this.vetor.length;
        int aux[] = new int[tam];

        int j = 0;

        for(int i = tam-1;i >= 0; i--){
                aux[j] = this.vetor[i];
                //System.out.println("vetor " + i + " = " + this.vetor[i] + " | " + "vetorAux " + j + " = " + this.vetor[j]);
                j++;
            }

        for(int i = 0; i < tam; i++){
            this.vetor[i] = aux[i];
        }

        }
}

