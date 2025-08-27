/* 4)
 (2,5 pontos– Vetores e Ponteiros) Escreva um código em C que declara o seguinte vetor
 ordenado:
 int v[5] = {1,2,3,4,5};
Exiba os valores deste vetor em ordem decrescente, com um laço for e 2 ponteiros, um
 apontando para o último elemento do vetor, já o outro, para o primeiro elemento do vetor.
 Aplique aritmética de ponteiros para percorrer o vetor*/
#include<stdio.h>
#include<stdlib.h>

int main(){

    int vetor[5] = {1,2,3,4,5};
    int *inicio = vetor; 
    int *fim = vetor+4;

    int som = 0; 

    for(; fim >= inicio; fim--){
        // printf(" %d \n", *fim);
        som += *fim;
    }

    printf("som = %d", som/5);
    return 0; 
}