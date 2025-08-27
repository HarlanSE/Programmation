// 5- Escreva um programa que leia um número inteiro n fornecido pelo usuário e gere um
// quadrado de n linhas e n colunas que tenha caracteres x nas posições da diagonal principal e
// caracteres + nas demais.
// Entrada: 4
// Saída:
// x+++
// +x++
// ++x+
// +++x

#include<stdio.h>

int main(){

    int n; 
    printf("Digite um numero n "); 
    scanf("%d", &n);

    for(int linha = 0; linha < n; linha++){

        for(int coluna = 0; coluna < n; coluna++){
            
            if(linha == coluna){           //1 5 | 2 4 | 3 3 | 4 2 | 5 1 
                printf("X");
            } else{
                printf("+");
            }
        } printf("\n");

    }

    // for(int linha = 0; linha < n; linha++){

    //     for(int coluna = 0; coluna < n; coluna++){
            
    //         if(linha == coluna){
    //             printf("x");
    //         } else{
    //             printf("+");
    //         }
    //     } printf("\n");

    // }

    return 0;
}