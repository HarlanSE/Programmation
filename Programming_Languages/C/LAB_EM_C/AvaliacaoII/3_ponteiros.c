/* 3)
 (2,5 pontos- Ponteiros) Escreva um código em C que declara uma variável n = 7 e um
 ponteiro p que aponte para esta variável n. Exiba as seguintes informações como saída:
 · Oendereço de n
 · Ovalor de n
 · Oendereço de p
 · Ovalor de p
 · Ovalor armazenado onde p está apontando*/

#include<stdio.h>
#include<stdlib.h>

int main() {

    int n = 7;
    int *p = &n;
    
    printf("O endereco de n e: %d\n", &n);
    printf("O valor de n e: %d\n", n);
    printf("O endereco de p e: %p\n", &p);
    printf("O valor de p e: %p \n", p);
    printf("O valor armazenado onde p esta apontando e: %d \n", *p);

    return 0;
}