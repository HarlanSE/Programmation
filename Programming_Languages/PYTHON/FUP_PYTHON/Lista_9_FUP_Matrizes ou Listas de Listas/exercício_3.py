matriz = []
n = int(input(""))

for linhas in range(n): 
    linha = []
    for colunas in range(n): 
        linha.append(linhas*colunas)
    matriz.append(linha)

for linhas in range(n):
    if linhas > 0 and linhas < n: 
        print()
    for colunas in range(n): 
        print(matriz[linhas][colunas], end = " ")
    
# for linhas in range(n): 
#     for colunas in range(n): 
#         print(matriz[linhas][colunas], end = " ")
#     print()
