//  1)
//  (2,0 pontos) Uma loja está fazendo uma promoção de um produto onde o cliente pode
//  comprar qualquer quantidade desejada. O valor unitário do produto é fixo, mas, caso o cliente
//  compre mais de 10 unidades, ele recebe um desconto de 5% no valor total da compra.
//  Escreva um programa em linguagem C que solicite ao usuário:
//  a quantidade de unidades compradas (tipo numérico inteiro);
//  o preço unitário do produto (tipo numérico decimal);
//  Posteriormente:
//  Calcule o valor total da compra (sem desconto);
//  Caso a quantidade seja superior a 10, aplique um desconto de 5% no valor total;
//  Exiba na tela os valores em formatação monetária (Ex: R$ 12.99):
//  o valor total antes do desconto;
//  o valor final com ou sem o desconto (conforme o caso).

#include<stdio.h>

int main(){

    int unidCompradas; 
    float precoDoProduto, valorTotalSemDesconto;

    printf("Insira quantas unidades deseja comprar: "); 
    scanf("%d", &unidCompradas); 

    printf("Digite o valor do produto: "); 
    scanf("%f", &precoDoProduto); 

    valorTotalSemDesconto = (unidCompradas * precoDoProduto);
    
    if(unidCompradas > 10){
       float valorTotalcomDesconto = valorTotalSemDesconto - ((valorTotalSemDesconto/100)*5);       
        
        printf("Valor total antes do desconto: R$ %.2f \n ", valorTotalSemDesconto);
        printf("Valor final depois do desconto: R$ %.2f \n ", valorTotalcomDesconto);
        
    } else {
        printf("Valor total antes do desconto: R$ %.2f \n ", valorTotalSemDesconto);
        printf("Valor final sem desconto: R$ %.2f \n ", valorTotalSemDesconto);
    }
                

    return 0; 
}