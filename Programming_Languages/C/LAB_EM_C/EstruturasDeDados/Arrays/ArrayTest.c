#include<stdio.h>
#include<windows.h>
//   1 2 3 
// 1 x x x
// 2 o o o
// 3 x x x 

int main(){

    char jogoDaVelha[3][3];
    
    // preenche com 'A'
    for(int linha = 0; linha < 3; linha ++){
        for(int coluna = 0; coluna < 3; coluna ++){
            jogoDaVelha[linha][coluna] = 'A';
        }          
    }

    // imprimir matriz
    for(int linha = 0; linha < 3; linha ++){
        for(int coluna = 0; coluna < 3; coluna ++){
            if(coluna == 1){
                printf("| %c |", jogoDaVelha[linha][coluna]);
            }
            else{
                printf(" %c ", jogoDaVelha[linha][coluna]); 
            }
        }
        printf("\n");
        if(linha < 2){
        for(int i = 0; i <= 10; i++)
            printf("%c", 196);
        printf("\n"); 
        }
    }
                                                          
    return 0; 
}
