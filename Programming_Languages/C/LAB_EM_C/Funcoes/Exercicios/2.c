//  ▪ Construa um programa em C que leia um caractere (letra) e, por meio de uma função, 
// retorne se este caractere é uma consoante ou uma vogal. Ao final imprima o 
// resultado.

#include<stdio.h>

// void ConsoanteOuVogal(){
//     char letra; 
    
//     printf("Insira uma letra \n");
//     scanf("%c", &letra); 
    
//     if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){
//         printf("A letra %c eh vogal!", letra);
//     } else{
//          printf("A letra %c eh consoante!", letra);
//     }
// }

// verificar se a letra está no alfabeto:
int verificarAlfabeto(char letra){

    char alfabeto[52]; 
    for(int i = 0; i < 26; i++){
        alfabeto[i] = 'A' + i; //Na tabela ASCII: 'A' = 65, 'Z' = 90;
        alfabeto[i+26] = 'a' + i; // Na tabela ASCII: 'a' = 97, 'z' = 122; 
    }

    for(int letraAux = 0; letraAux < 52; letraAux++){
        if(letra == alfabeto[letraAux])    
            return 1; 
    }
    return 0; 
}

// Verificar se a letra é vogal ou consoante:
void ConsoanteOuVogal(char letra){
    int vogal = 0; 
    int letravalida = verificarAlfabeto(letra);

    char vogais[] = {'A','E','I','O','U','a','e','i','o','u'};
    
    if(letravalida){
        for(int i = 0; i < 10; i++){
            if(letra == vogais[i]){
                printf("letra %c eh vogal \n", letra);
                vogal = 1; 
            } 
        }
        if(!vogal)
            printf("letra %c eh consoante \n", letra); 
    } else {
        printf("letra invalida! \n");
    }
}

int main(){

    char letra;
    printf("Insira uma letra \n");
    scanf("%c", &letra);

    ConsoanteOuVogal(letra);

    return 0; 
}