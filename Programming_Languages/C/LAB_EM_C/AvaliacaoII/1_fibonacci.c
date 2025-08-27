/* 1)
 (2,5 pontos- Funções) Escreva 2 códigos em C, o primeiro encontra o n-ésimo termo da
 sequência de Fibonacci de maneira recursiva, já o segundo, de maneira iterativa. Execute
 ambos os códigos e avalie o tempo de execução de cada código com n=40 (utilizando o
 comando time no Linux ou através de IDEs como VSCode ou CodeBlocks). Comente os
 tempos de execução em cada código-fonte.*/

#include<stdio.h>
#include<time.h>

int fibonacci_rec(int n){
    if(n <= 1)
        return n; 
    return fibonacci_rec(n-1) + fibonacci_rec(n-2); 
}
 
int fibonnacci_ite(int n){
    if(n <= 1)
        return n;

    int ant = 0, atual = 1, prox;
    for(int i = 2; i <= n; i++){
    prox = ant + atual; 
    ant = atual; 
    atual = prox; 
    }

    return atual;
}

int main(){

    int n = 40; 

   // --- Medição da função Fibonacci Recursiva ---
    clock_t inicio_rec, fim_rec; 
    double tempo_rec;

    inicio_rec = clock(); 
    int fibonacci_recursiva = fibonacci_rec(n);
    fim_rec = clock();    

    tempo_rec = (double)(fim_rec - inicio_rec) / CLOCKS_PER_SEC;

    printf("O Fibonacci recursivo de %d eh %d \n", n, fibonacci_recursiva);
    printf("Tempo de execucao recursiva: %.10f segundos\n", tempo_rec);


    // --- Medição da função Fibonacci Iterativa ---
    clock_t inicio_ite, fim_ite; 
    double tempo_ite;

    inicio_ite = clock(); 
    int fibonacci_iterativa = fibonnacci_ite(n);
    fim_ite = clock();   

   
    tempo_ite = (double)(fim_ite - inicio_ite) / CLOCKS_PER_SEC;

    printf("O Fibonacci iterativo de %d eh %d \n", n, fibonacci_iterativa);
    printf("Tempo de execucao iterativa: %.10f segundos\n", tempo_ite);

   
    return 0; 
}