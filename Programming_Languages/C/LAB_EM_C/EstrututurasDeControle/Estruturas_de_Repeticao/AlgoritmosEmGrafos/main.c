
int main(){

// typedef struct grafo
// {
//  int verticesVizinhos;

// } Grafo;
 
// int linhas = 3, colunas = 3;
// int matrizDeAdjacencia[linhas][colunas];

// for(int i = 0; i < linhas; i++){
//     for(int j = 0; j < colunas; j++){
//         if(i == j) matrizDeAdjacencia[i][j] = 0; 
//         else matrizDeAdjacencia[i][j] = 1;
// }
// }

// int sinal = 0; 

// for(int i = 0; i < linhas-1; i++){

//     int contador = 0; // da linha
//     int contadorlinhaMais1 = 0; // prox linha

//     for(int j = 0; j < colunas-1; j++){

//         if(matrizDeAdjacencia[i][j] != 0)           
//             contador ++;

//         if(matrizDeAdjacencia[i+1][j] != 0) contadorlinhaMais1 ++; 

//             if(j == colunas - 2){
//              if(contador != contadorlinhaMais1)
//                 sinal = 1; 
//                 break;
//             }
// }
// }

// if(!sinal){
//     printf("O grafo é %d regular", colunas - 1);
// }
// else  printf("O grafo não é %d regular", colunas - 1); 

for(int i = 0; i < linhas-1; i++){

    int contador = 0;
    int contadorlinhaMais1 = 0;

    for(int j = 0; j < colunas; j++){

        // Conta arestas da linha i
        if(matrizDeAdjacencia[i][j] != 0)
            contador++;

        // Conta arestas da linha i+1
        if(matrizDeAdjacencia[i+1][j] != 0)
            contadorlinhaMais1++;
    }

    // Se os graus forem diferentes
    if(contador != contadorlinhaMais1){
        sinal = 1;
        break;  // sai do loop
    }
}

    return 0; 

}