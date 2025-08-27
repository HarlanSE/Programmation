#include<stdio.h>
//#include<stdlib.h>
// 1 – Escreva uma função de busca em um programa em C. Tal função deve 
// procurar por um elemento em um vetor de inteiros e retornar o índice do 
// primeiro elemento encontrado com aquele valor. O programa deve ler um vetor 
// de 10 elementos, ler o número procurado e retornar a sua posição. 
// Exemplo: [6,2,9,3,6,8,3,5,7,8]; Procurar o elemento 8; Resposta: índice 5. 

int funcaoDeBusca(int vetor[], int tamanhoDoVetor, int valorDeBusca){ //tamanho, valor a ser procurado 
    for(int i = 0; i < tamanhoDoVetor; i++){
        if(vetor[i]==valorDeBusca){
            printf("Indice do valor %d eh %d", valorDeBusca, i);
            return(i);
        }
    } 
    
    printf("Erro, valor %d nao encontrado!", valorDeBusca );
    return -1; 
}

int main(){
    int valorDeBusca;
    int arrayA[] = {6,2,9,3,6,8,3,5,7,8, 8, 9, 11};

    //descobrir o tamanho do array
    int tamanhoDoArray = sizeof(arrayA) / sizeof(arrayA[0]);
    printf("tamanho do array %d \n" , tamanhoDoArray);
    //tamanho_do_array_em_elementos = sizeof(nome_do_array) / sizeof(nome_do_array[0]);

    printf("Valor a ser buscado: ");
    scanf("%d", &valorDeBusca);

    funcaoDeBusca(arrayA, tamanhoDoArray, valorDeBusca);
    return 0; 
}