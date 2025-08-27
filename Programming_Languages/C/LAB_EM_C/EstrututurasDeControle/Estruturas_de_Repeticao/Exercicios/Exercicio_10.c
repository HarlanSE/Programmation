// 4- A conversão de graus Fahrenheit para Celsius é obtida por Tc=(Tf-32)*5/9, em que
//  Tc é a temperatura em graus Celsius e Tf em Fahrenheit. Faça um programa C que
//  calcule e que imprima uma tabela de graus Fahrenheit e graus Celsius, cujos graus
//  variem de 50 a 65, de 1 em1.


#include<stdio.h>

int main() {
   int Tf; 
   float Tc; 

    printf("Fahrenheit |  Celsius \n");

   for(Tf = 50; Tf <= 65; Tf++){
    Tc = (Tf-32)*5.0/9.0;
    printf("    %d     |   %.2f \n", Tf, Tc);
   }
    return 0;
}