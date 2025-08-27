/*Desenvolva um programa que recebe três notas de um aluno e uma letra. Se a letra 
for A, calcula a média aritmética das notas do aluno, se for P, calcula a sua média 
ponderada (pesos: 5, 3 e 2).*/
#include<stdio.h>
#include<stdlib.h>

void mediaAP(float a, float b, float c, char letra){

    switch (letra){

    case 'A':
    case 'a':
        printf("Media aritmetica: %.2f", (a+b+c) / 3);
        break;

    case 'P':
    case 'p':
        printf("Media ponderada: %.2f", (a*5+b*3+c*2) / 10);
        break;

    default:
        printf("Opção %c invalida!", letra);
        break;
    }
}

int main(){

    float a,b,c; 
    char letra; 

    printf("Digite a letra (A para media aritmetica, P para media ponderada): ");
    scanf(" %c", &letra); 

    printf("valor para a: "); 
    scanf("%f", &a);
    
    printf("valor para b: "); 
    scanf("%f", &b);
    
    printf("valor para c: "); 
    scanf("%f", &c);

    mediaAP(a, b, c, letra);

    return 0; 
}