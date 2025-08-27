#include<stdio.h>
#include<stdlib.h>

int main(){

    /*      <<< FOR >>>

        for(inicio; condicao; intervalo/passo){
            --- BLOCO ---
        }

        ===> O for necessita da especificação do escopo das variáveis;
        exemplo: O for pode ter seu inicio inicializado dentro da estrutura, como var local: 
        
        for(int i = 0; i <= 10; i++){
            printf("%d \n", i);
        }

        Aqui, o i é desalocado após sair do laço. 

        exemplo 2: O for pode ter seu inicio inicializado fora da estrutura, como var global: 

        int j = 1; 
        for(j, j>10; i--){
            printf("%d \n", j);
        }
        
        Aqui, o j não é desalocado após o término do laço e seu valor continua sendo o da última incrementação do laço

        exemplo 3: O for pode ter seu início omitido, a depender viabilidade da condicao: (IMPORTANTE!!!)

        int i = 0; 

        for(; i <= 10; i++){
            printf("%d \n", i);
        }

        Aqui, a condição do for é viável, então é executado e atualiza a var global i



            <<< WHILE >>>

        while(condição){
            --- BLOCO ---
        }



            <<< DO-WHILE >>>
            
        do{               
            --- BLOCO ---
        } 
        While(condição)  
        
        ===> "O Do-While executa o bloco ao menos uma vez"
        ===>  "O -While - Retorna para o bloco do -Do-"
        
    */

    return 0; 
}