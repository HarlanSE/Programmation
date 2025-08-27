/*2 - Escreva um programa que leia uma string e, em seguida, imprima a inversa da string lida. 
 Exemplo: Tangamandapio    oipadnamagnaT*/

 #include<stdio.h>
 #include<string.h>

 int main(){

    char string[50]; 
    printf("palavra: "); 
    scanf("%s", string); 

    int tam = strlen(string); 

    for(int i = tam; i > -1; i--){
        printf("%c", string[i]); // \0      
    }

    return 0;
 }