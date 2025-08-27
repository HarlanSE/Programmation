/*3 - Escreva um programa que leia uma string e, em seguida, informe se é ou não um palíndromo. Exemplo: arara  arara (SIM)
Exemplo: teste  etset (NÃO)*/


 #include<stdio.h>
 #include<string.h>

 int main(){

    char string[50]; 
    char stringcpy[50]; 

    printf("palavra: "); 
    scanf("%s", string); 

    int tam = strlen(string); 

    for (int i = 0; i < tam; i++) {
        stringcpy[i] = string[tam - 1 - i];
    }
    stringcpy[tam] = '\0';

    if(!strcmp(string, stringcpy))
        printf("%s Eh palidromo (SIM)\n", string); 
    else
        printf("\n %s eh palindromo (NAO), pois seu inverso eh %s! \n\n ", string, stringcpy);

    return 0;
 }