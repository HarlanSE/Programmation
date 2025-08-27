// 4) (3,0pontos) Implemente um programa em linguagem C que solicite ao usuário um
//  número inteiro positivo n(considere que sempre será informado um número entre 1 e 10) e,
//  em seguida,gere e exiba uma matriz quadrada de ordem n.
//  A matriz deve conter os seguintes valores:
//  A diagonal principal deve conter apenas o número 1.
//  Os elementos acima da diagonal principal devem conter o número 2.
//  Os elementos abaixo da diagonal principal devem conter o número 3.
//  Exemplo de execução para n = 4:
//  1222
//  3122
//  3312
//  3331
//  Utilize laços de repetição aninhados (um laço dentro de outro laço)para imprimir estes
//  valores.

#include<stdio.h> 

int main(){

    int n; 
    printf("Digite um valor para N: ");
    scanf("%d", &n); 

    if(n >= 1 && n <= 10){

        for(int linhas = 0; linhas < n; linhas++){
           
            for(int colunas = 0; colunas < n; colunas ++){
                if(linhas==colunas){

                    printf("1");

                } else if(linhas < colunas) {

                    printf("2");

                } else{
                    printf("3");
                }
            
            }
            printf("\n");
        }

    }
    else{
        printf("<<<Valor invalido, tente novamente!>>>");
    }


    return 0; 
}