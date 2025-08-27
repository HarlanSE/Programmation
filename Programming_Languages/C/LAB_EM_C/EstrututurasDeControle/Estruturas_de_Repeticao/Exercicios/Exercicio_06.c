// 6- Faça um programa que exibe as tabuadas da multiplicação, desde a tabuada do 1 a
//  tabuada do 10, utilizando 2 laços de repetição for
#include<stdio.h>

int main(){

    for(int i = 1; i < 11; i++ ){

        printf("<<<TABUADA DO %d>>> \n", i);

        for(int j = 1; j < 11; j++ ){
            
            printf("%d x %d = %d \n", i, j , i*j);
        }
    }

    return 0; 
}