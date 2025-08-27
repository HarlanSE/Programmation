# Capítulo 2

#include <stdio.h>
#include <stdlib.h>

typedef struct no {
    int valor;
    struct no *prox;
} No;

int tam = 0;
No *inicio = NULL;

// Questão I
void adicionar(int valor, int pos) {
    if (pos >= 0 && pos <= tam) {
        No *novo = malloc(sizeof(No));
        novo->valor = valor;
        novo->prox = NULL;

        if (inicio == NULL) {
            inicio = novo;
        } else if (pos == 0) {
            novo->prox = inicio;
            inicio = novo;
        } else {
            No *aux = inicio;
            int i;
            for (i = 0; i < pos - 1; i++) {
                aux = aux->prox;
            }
            novo->prox = aux->prox;
            aux->prox = novo;
        }
        tam++;
    }
}

// Questão II
float questao2(No *aux) {
    int soma = 0;
    while (aux != NULL) {
        if (aux->valor > 0 && aux->valor % 2 == 0) {
            soma += aux->valor;
        }
        aux = aux->prox;
    }
    return soma * soma;
}

// Questão III, IV e V
void imprimeInverso(No *aux) {
    if (aux == NULL) return;
    imprimeInverso(aux->prox);
    printf("%d ", aux->valor);
}

// Questão I do Capítulo 3
int potencia(int indice, int potencia) {
    if (potencia >= 0) {
        if (potencia == 0) {
            return 1;
        }
        int i;
        for (i = 1; i < potencia; i++) {
            indice *= indice;
        }
        return indice;
    }
    return -1;
}

// Questões II, III e IV do Capítulo 3
No *fim = NULL;

void adicionarMedia(int valor) {
    No *novo = malloc(sizeof(No));
    novo->valor = valor;
    novo->prox = NULL;

    if (inicio == NULL) {
        inicio = novo;
    } else {
        No *aux = inicio;
        while (aux->prox != fim && aux->prox != NULL) {
            aux = aux->prox;
        }
        aux->prox = novo;
    }

    int soma = 0, cont = 0;
    No *aux2 = inicio;
    while (aux2 != NULL) {
        soma += aux2->valor;
        cont++;
        if (aux2->prox == fim || aux2->prox == NULL) break;
        aux2 = aux2->prox;
    }

    if (fim == NULL) {
        fim = malloc(sizeof(No));
        fim->prox = NULL;
        if (inicio == novo) {
            novo->prox = fim;
        } else {
            novo->prox = fim;
        }
    }
    fim->valor = soma / cont;
    novo->prox = fim;
}

void imprimirLista() {
    No *aux = inicio;
    while (aux != NULL && aux != fim) {
        printf("%d ", aux->valor);
        aux = aux->prox;
    }
    printf("\n");
}

int buscaMedia() {
    No *aux = inicio;
    while (aux != NULL && aux != fim) {
        if (aux->valor == fim->valor) {
            return fim->valor;
        }
        aux = aux->prox;
    }
    return -1;
}

int main() {
    adicionar(3, 0);
    adicionar(14, 1);
    adicionar(15, 1);
    adicionar(9, 2);
    adicionar(26, 0);

    printf("Questao 2: %.2f\n", questao2(inicio));

    printf("Impressao Inversa: ");
    imprimeInverso(inicio);
    printf("\n");

    printf("Potencia: %d\n", potencia(2, 3));

    adicionarMedia(3);
    adicionarMedia(5);
    adicionarMedia(1);
    adicionarMedia(1);

    imprimirLista();
    printf("Busca media: %d\n", buscaMedia());

    return 0;
}
