/*3- Faça um programa em C que receba um número n, passado pelo usuário, e retorne
 o enésimo termo da sequência: 1 3 7 15 31 63 127...*/

#include<stdio.h>
#include<math.h>

int main(){
                                                                    
    int n;

    printf("Digite um numero n: \n ");
    scanf("%d", &n);

     printf("%.2f", pow(2,n)-1);

    return 0; 
}