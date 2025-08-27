// ▪ Escreva um programa que solicite dois números ao usuário e apresente na tela o 
// resultado da soma do módulo desses números. Esse programa deve possuir uma função 
// para calcular o módulo.

#include<stdio.h>

void CalcularModulo(){
    int n1, n2; 
    
    printf("Insira um valor para N1\n");
    scanf("%d", &n1); 
    printf("Insira um valor para N2\n");
    scanf("%d", &n2); 
    
    //Caso n1 ou n2 seja(m) negativo(s), devemos mudar o sinal:
    if(n1 < 0){
        n1 *= (-1); 
    }
    if(n2 < 0){
        n2 *= (-1); 
    }
    

    printf("%d + %d = %d", n1, n2, n1+n2); 
}

int main(){

    CalcularModulo();

    return 0; 
}