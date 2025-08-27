// 2)
//  (2,0 pontos) Uma academia deseja automatizar parte do seu sistema de avaliação física.
//  Cada aluno realiza uma avaliação que consiste na verificação do seu peso (em quilogramas)
//  e altura (em metros), a partir dos quais é calculado o Índice de Massa Corporal (IMC),
//  utilizando a fórmula:
//  IMC = peso / (altura)²
// OBS: utilize a biblioteca math.h para elevar a altura ao quadrado.
//  Combase no valor do IMC, o sistema deve classificar o aluno conforme a seguinte tabela:

//

//  Escreva um programa em linguagem C que:
//  Solicite ao usuário a entrada do peso (float) e da altura (float).
//  Calcule o IMC usando a fórmula fornecida.
//  Mostre o valor do IMC com duas casas decimais.
//  Exiba a classificação do aluno de acordo com a tabela acima.

#include<stdio.h> 
#include<math.h> 
 
int main() { 
    float peso, altura, imc; 
 
    printf("Digite o peso (kg): "); 
    scanf("%f", &peso); 
 
    printf("Digite a altura (m): "); 
    scanf("%f", &altura); 
 
    imc = peso /pow(altura, 2); 
 
    printf("IMC do individuo = %.2f\n", imc); 
     
if (imc < 18.5) { 
    printf("Classificacao: Abaixo do peso\n"); 
} else if (imc >= 18.5 && imc <= 24.9){ 
    printf("Classificacao: Peso normal\n"); 
} else if (imc >= 25.0 && imc <= 29.9){ 
    printf("Classificacao: Sobrepeso\n"); 
} else if (imc >= 30.0 && imc <= 39.9){ 
    printf("Classificacao: Obesidade I\n"); 
} else { 
    printf("Classificacao: Obesidade II\n"); 
} 
 
return 0; 
 
} 