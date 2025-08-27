//  3)
//  (3,0 pontos) Você foi contratado para desenvolver um pequeno sistema de análise de
//  números reais que será utilizado por professores de matemática para verificar propriedades
//  numéricas de valores inseridos. Implemente um programa em C que apresente ao usuário o
//  seguinte menu de opções até que ele escolha sair (opção 0):
//  ========= MENU =========
//  1- Verificar se um número é positivo, negativo ou zero
//  2- Verificar se um número é maior que outro
//  3- Calcular a média de dois números
//  0- Sair
//  ========================
//  Regras e requisitos:
//  1–O menu deve rodar n vezes, em um laço de repetição, até que o usuário digite 0 para
//  sair.
//  2– Defina as opções do menu com switch case, sendo o caso default: opção inválida,
//  tente novamente

#include<stdio.h>

int main(){

        float n, m;
        int opcao;

    do{

        printf("========= MENU ========= \n"); 
        printf(" 1- Verificar se um numero eh positivo, negativo ou zero \n");
        printf(" 2- Verificar se um numero eh maior que outro \n");
        printf(" 3- Calcular a media de dois numeros \n");
        printf(" 0- Sair \n");
        printf("========================\n");  

        printf("Escolha a opcao: ");
        scanf("%d", &opcao);
        
        switch(opcao){
            case(1): 
                printf("Digite um numero n: ");
                scanf("%f", &n);
                if(n<0){
                    printf("%.2f, eh negativo \n", n); 
                }else if(n>0){
                    printf("%.2f, eh positivo \n", n);
                } else{
                    printf("%.2f, eh nulo \n", n);
                }
            break; 

            case(2):
                 printf("Digite um numero n:  ");
                 scanf("%f", &n);
                 printf("Digite um numero m:  ");                 
                 scanf("%f", &m);

                 if(n > m){
                    printf("N: %.2f eh maior que M: %.2f \n", n, m); 
                 }else if(m>n){
                    printf("M: %.2f eh maior que N: %.2f \n", m, n); 
                 }else {
                    printf("N: %.2f eh igual a M: %.2f \n", m, n); 
                 }
            break; 

            case(3): 
                 printf("Digite um numero n: ");
                 scanf("%f", &n);
                 printf("Digite um numero m: ");
                 scanf("%f", &m);

                 printf("Media entre %.2f e %.2f eh igual a %.2f \n", n, m, (n+m)/2);
            break; 

            case(0):
                printf("Saindo do programa...\n "); 
            break;

            default: 
            printf("opcao invalida, tente novamente! \n");
            

    }
        } while(opcao != 0);

        return 0;
}

