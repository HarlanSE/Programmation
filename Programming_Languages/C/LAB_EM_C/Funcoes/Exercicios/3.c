#include<stdio.h>
//  ▪ Escreva um programa que solicite dois números inteiros ao usuário e que apresente 
// na tela como resultado o dobro desses números que devem ser somados e o resultado 
// da soma devem ser triplicados. Esse programa deve possuir uma função para dobrar o 
// valor de um número, outra para somar dois números e uma terceira para triplicar um 
// número

int dobrarValor(int n){
    n *= 2; 

    return n;
}

int somarValores(int A,int B){

    int soma; 
    soma = A + B;

    return soma; 
}

int triplicarSoma(int soma){  
    soma *= 3;
    
    return soma; 
}

void controle(int A, int B){
    int a = dobrarValor(A);
    int b = dobrarValor(B);

    int soma = somarValores(a, b); 

    int triplo = triplicarSoma(soma);

    printf("%d", triplo);
}

int main(){

    int A, B; 

    printf("Deh um valor para A: \n");
    scanf("%d", &A); 

    printf("Deh um valor para B: \n");
    scanf("%d", &B);
    
   controle(A,B);

    return 0; 
}