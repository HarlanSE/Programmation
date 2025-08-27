// função: Uma sequencia de comandos que pode ser executada a partir da função main;  

/* <<< Sintaxe de uma função: >>> 
TipoDeRetorno NomeDaFuncao (Parâmetros){
    --- Bloco/CorpoDaFuncao --- 
    return ValorRetornado; 
    } 
*/

/*
▪ O Escopo de uma variável determina como e onde uma 
variável poderá ser utilizada dentro de um programa.
 Existem três escopos distintos em C:
 • Local
 • Parâmetro de Função
 • Global
*/

#include<stdio.h>

void ImprimirUmQuadrado(int n){
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            printf(" * "); 
        } 
        printf("\n");
}
}

int main(){
    int n; 
    printf("Deh um valor para um lado do quadrado\n"); 
    scanf("%d" , &n );

    ImprimirUmQuadrado(n);

    return 0; 
}