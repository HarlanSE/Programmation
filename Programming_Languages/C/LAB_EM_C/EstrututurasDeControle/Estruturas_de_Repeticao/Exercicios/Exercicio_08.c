// 8 - Sabe-se que uma determinada espécie de Bactéria divide-se a cada segundo. Faça
//  um programa em C que calcule o número de bactérias obtidas em n segundos. O
//  número de segundos deve ser passado pelo usuário.

#include<stdio.h>
#include<math.h>

int main(){

    int segundos, bacterias = 1; 

    printf("numero de segundos: "); 
    scanf("%d", &segundos);

    while(segundos != 0){
        bacterias = pow(2, segundos);

        printf("%d \n", bacterias);

        segundos --; 

    }

    return 0;
}