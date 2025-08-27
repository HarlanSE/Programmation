/*4 – Escreva um alg que lê e preenche os elementos de 
uma matriz[4][4]. Leia um número e informe se esse 
número está ou não na matriz.*/

#include<stdio.h>
#include<stdlib.h>

int main(){
    char arraybidimensional[4][4];
     
    for(int linha = 0; linha<4; linha++){
        for(int coluna = 0; coluna<4; coluna++){
            arraybidimensional[linha][coluna] = 'x';  
        }
    }

    for(int linha = 0; linha<4; linha++){
        for(int coluna = 0; coluna<4; coluna++){
            printf(" %c ", arraybidimensional[linha][coluna]);  
        }
        printf("\n");
    }

    return 0;     
}
    