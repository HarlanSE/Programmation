/* Em épocas de pouco dinheiro, os comerciantes estão procurando aumentar suas vendas 
oferecendo desconto. Faça um programa que permita entrar com o valor de um produto 
e o percentual de desconto e imprimir o novo valor com base no percentual informado. 
Para fazer o cálculo, implemente uma função.*/
#include<stdio.h>

void calcularDesconto(float valor, int desconto){
    float descontoPerc;
    
    if(desconto >= 1 && desconto <= 100 ){
        descontoPerc = (float)desconto/100; 
    } else{
        printf("desconto de %d porcento eh invalido! \n", desconto);
        return;
    }

    valor = valor - valor*descontoPerc;
    printf("valor com desconto R$ %.2f \n", valor);
}

int main(){
    float valor; 
    int desconto; 

    printf("Valor do produto: R$ ");
    scanf("%f", &valor);

    printf("desconto: ");
    scanf("%d", &desconto);

    calcularDesconto(valor, desconto);
    return 0; 
}