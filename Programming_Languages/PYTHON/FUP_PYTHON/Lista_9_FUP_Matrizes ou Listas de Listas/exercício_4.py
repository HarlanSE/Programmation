matriz = []
for linhas in range(4): 
    linha = []
    for colunas in range(4): 
        linha.append(int(input("")))
    matriz.append(linha)
    
for linhas in range(4):
    for colunas in range(4): 
        print(matriz[linhas][colunas], end = " ")
    print()
    
# for linhas in range(4):
#     if linhas > 0: 
#         print()
#     for colunas in range(4): 
#         print(matriz[linhas][colunas], end = " ")
    
maior = matriz[0][0]
linhaM = colunaM = 0

for linhas in range(4): 
    for colunas in range(4): 
        if matriz[linhas][colunas] > maior: 
            maior = matriz[linhas][colunas]
            linhaM = linhas
            colunaM = colunas
            
print(linhaM)
print(colunaM)
print(maior)