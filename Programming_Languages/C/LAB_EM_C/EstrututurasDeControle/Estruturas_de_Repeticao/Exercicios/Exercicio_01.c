// 1-Escreva um programa que calcule e exiba a soma dos quadrados dos 100 primeiros
//números inteiros.

#include<stdio.h>
#include<math.h>

int main(){

    long int soma = 0;  

    for(int i = 0; i < 101; i++){
        soma += (i*i); 
    } 

    printf("soma: %.2li", soma); 

    return 0; 
}
