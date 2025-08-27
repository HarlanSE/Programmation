/*1 - Receba uma string e verifque se é maiúscula (se todos os seus caracteres são maiúculos).
 Em caso afirmativo, retorne 1. Em caso negativo, retorne 0.*/

 #include<stdio.h>
 #include<string.h>

int verificarMaiuscula(char string[]){

    char alfabeto[] = {"ABCDEFGHIJKLMNOPQRSTUVWXYZ"};
    // char alfabeto[26];
   
    // for(int i = 0; i < 26; i++){
    //     alfabeto[i] = 'A' + i;
    // }

    for(int i = 0; i < strlen(string); i++){
        int M = 0;

        for(int j = 0; j < 26; j++){

            if(string[i] == alfabeto[j]){

                printf("String[i]: %c == alfabeto[j]: %c \n", string[i], alfabeto[j]);
                
                M = 1; 
                break;
            }    
        }
        if(!M)
            return 0;
    }   
    return 1; 
}

int main(){
    #define tam 50

    
    char string[tam]; 

    printf("Digite uma string: ");
    scanf("%s", string);
    
    printf("%d", verificarMaiuscula(string));


    return 0; 
}