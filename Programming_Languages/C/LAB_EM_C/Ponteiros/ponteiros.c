#include<stdio.h>
/*  
     <<< Ponteiros >>>
     
---> Sintaxe:
    [identificador] *[nome] = [valor]; 
    ex. int *p = &a;

---> Como usar: 

    1 - Valor do ponteiro (para quem ele "aponta"): 
        printf("%p", p);

    2 - Endereço do ponteiro (onde o ponteiro está armazenado): 
        printf("%p", &p);

    3 - Valor da var que ele aponta (Desreferenciação):
        printf("%d",*p);

    4 - Ponteiro Nulo (Aponta para nada)
        int *p = NULL; 

    5 - ponteiro para ponteiro (Um ponteiro que guarda o endereço de outro ponteiro)
        int *p = &a;
        int **pp = &p;

    obs. Muito usado em funções que precisam modificar ponteiros passados como parâmetro.

    6 - Aritmética de Ponteiros
        int *p = v;

        printf("%d\n", *p);     // 10
        printf("%d\n", *(p+1)); // 20
        printf("%d\n", *(p+2)); // 30

    7. Ponteiro Constante vs. Constante Apontada
        const int *p1 = &a;  // não pode alterar o valor de *p1
        int *const p2 = &a;  // não pode mudar para onde p2 aponta

    8. Ponteiros e Funções

    Passando valores por referência:

        void incrementa(int *x) {
            (*x)++;
        }

        int main() {
            int a = 5;
            incrementa(&a);
            printf("%d\n", a); // 6
        }

    Permite que uma função modifique diretamente a variável passada.

    9. Ponteiro Genérico (void *)
        void *p;
        int a = 10;
        p = &a;

        printf("%d\n", *(int *)p);

    Pode apontar para qualquer tipo, mas precisa de conversão de tipo ao desreferenciar.

    */  
int main(){
    // exemplos:
    int a = 195; 
    int *p = &a; 

    printf("%p \n", p);
    printf("%p \n", &p);
    printf("%d \n", *p);
    return 0; 
}