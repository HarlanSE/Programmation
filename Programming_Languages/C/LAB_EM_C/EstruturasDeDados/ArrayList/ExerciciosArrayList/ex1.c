#include<stdio.h>

int main(){
    // Para inicializar um vetor com os valores dentro: Tipo Nome_Do_Vetor[Tamanho_Opcional] = {a,b,c,d...n}; 
                                    // obs. Nesse caso o compilador calcula o valor do vetor automáticamente.
    int tamVetor;

     printf("Qual o tamanho do vetor? \n"); 

    scanf("%d", &tamVetor);
    
    int i, vetor[tamVetor]; 

    //preecher Vetor
    for(i = 0; i < tamVetor; i++){
        vetor[i] = i+1; 
    }

   
    //imprimir Vetor
    for(i = 0; i < tamVetor; i++){

        printf("%i \n", vetor[i]); 
    }

    return 0; 
}
