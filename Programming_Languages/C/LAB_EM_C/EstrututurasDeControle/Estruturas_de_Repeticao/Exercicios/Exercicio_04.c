/*
4- Faça umprograma que leia um número inteiro positivo n e imprima n linhas com o
 seguinte formato (exemplo para n = 6):

*/
#include<stdio.h>
#include<math.h>


int main(){

    int n; 
    printf("Qual o valor de n? ");
    scanf("%d", &n); 
    
        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= i; j++ ){
                printf("_");
            }

            printf("%d \n", i); 
        }

    return 0;
}