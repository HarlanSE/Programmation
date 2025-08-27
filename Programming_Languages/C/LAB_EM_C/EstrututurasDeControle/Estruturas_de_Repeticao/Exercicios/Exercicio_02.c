/*2- Dado um número, crie um programa que escreva todos os números ímpares menores
 e/ou iguais a esse número e maiores ou igual a 1. Considere que o número informado é
 positivo.*/

 #include<stdio.h>
 #include<math.h>

 int main(){

    int n; 
    printf("Deh um valor para n: ");
    scanf("%d", &n); 

    if(n >= 1 ){

    for(int i = 1; i <= n; i++){         //1, 3 , 5 , 7, 9, 10 

        if(i%2 != 0){
            printf("%d \n", i);
        }
            //Ponto de controle;
    }

    /*
    for(; n >= 1; n--){         

        if(n%2 != 0){
            printf("%d \n", n);
            */
    
    } else { 
        printf("O valor informado eh invalido.");
    }

    return 0;
}
