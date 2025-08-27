/*
 3- Faça umprograma Cqueleia dez números que representem as notas de dez alunos, e
 que apresente:
 a) a soma dos números;
 b) a média dos números;
 c) o maior número;
 d) o menor número.
 Considere que as notas são informadas corretamente no intervalo de 1 a 10.
 
*/

#include<stdio.h>
#include<math.h>

int main(){

    float nota;

    printf("deh uma nota para o aluno: 1 "); 
    scanf("%f", &nota);
    
    float soma = nota;
    float maior, menor = nota;

    for(int i = 2; i < 11; i++){
     
        printf("deh uma nota para o aluno: %d ", i); 
        scanf("%f", &nota);
        
        soma += nota;
 
        if(nota > maior){
            maior = nota; 

        } else if(nota < menor){
            menor = nota;
        }
    }

    printf("Soma eh igual: %.2f \n", soma);
    printf("Media eh igual: %.2f \n", soma/10);
    printf("Maior eh igual: %.2f \n", maior);
    printf("Menor eh igual: %.2f \n", menor);

    return 0; 
}