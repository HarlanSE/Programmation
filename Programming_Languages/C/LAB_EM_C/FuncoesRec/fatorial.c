/*Escreva 2 algoritmos, um recursivo e outro iterativo, que calcule 
o fatorial de um número n.
Sabendo que
Ex: 5! = 1*2*3*4*5 = 120
5! = 5 * 4! = 120 
*/

#include<stdio.h>

long long int fatorial_Iterativa(int n){
    long long int resultado = 1;

    for(int i = 1; i <= n ; i++){
        resultado *= i;
        // printf("i = %d \n", i);
        // printf("resultado = %d \n", resultado);

    }
    return resultado; 
}

int fatorial_Recursiva(int n){
    if(n == 1) 
        return 1; 
    else 
        return n * fatorial_Recursiva(n-1);
}

int main(){
     

    while(1){
    int n; 
    char opcao;

    printf("Opcao: \n"); 
    scanf(" %c", &opcao);

    if(opcao == 'P' || opcao == 'p')
        break;
    
    printf("valor de n: \n");
    scanf("%d", &n); 

    printf("valor pela iterativa eh: %lld \n", fatorial_Iterativa(n));
    printf("valor pela recursiva eh: %d \n", fatorial_Recursiva(n));
    }

    return 0; 
}