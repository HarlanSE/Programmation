//  5- Faça um programa que leia dois conjuntos de dois valores, o primeiro
//  representando o número do aluno e o segundo representando a sua altura em
//  centímetros. Encontre o aluno mais alto e o mais baixo. Mostre o número do aluno
//  mais alto, e o número do aluno mais baixo, juntamente com suas alturas

#include<stdio.h>

int main(){

    int A, B;
    float Ah,Bh;

    printf("Digite o numero do aluno A: \n"); 
    scanf("%d", &A);
    printf("Digite a altura do aluno A em cm: \n"); 
    scanf("%f", &Ah);
    
    printf("Digite o numero do aluno B: \n"); 
    scanf("%d", &B);
    printf("Digite a altura do aluno B em cm:\n "); 
    scanf("%f", &Bh);
    

    if(Bh>Ah){
        printf("Aluno mais alto eh: %d \n", B); 
    } else if(Ah>Bh){
        printf("Aluno mais alto eh: %d \n", A);
    } else{
        printf("Os dois tem a mesma altura. \n");
    }
    
    return 0; 
}