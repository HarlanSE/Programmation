/* 2)
 (2,5 pontos- Matrizes) Escreva um algoritmo em C que lê e preenche os elementos de
 uma matriz[4][4]. No final, exiba o valor das somas de cada coluna da matriz.*/
 
#include<stdio.h>

int main() {

    int matriz[4][4];
    int linha, coluna;

    printf("Digite os elementos da matriz:\n");
    for (linha = 0; linha < 4; linha++) {
        for (coluna = 0; coluna < 4; coluna++) {
            printf("Elemento [%d][%d]: ", linha, coluna);
            scanf("%d", &matriz[linha][coluna]);
        }
    }

    for (linha = 0; linha < 4; linha++) {
        int sm_linha = 0;
        for (coluna = 0; coluna < 4; coluna++) {
            sm_linha += matriz[linha][coluna];
        }
        printf("Soma das linhas %d = %d\n", coluna, sm_linha);
    }

    return 0;
}
