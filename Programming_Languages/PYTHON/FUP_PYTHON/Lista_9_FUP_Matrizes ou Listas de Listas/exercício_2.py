matriz = []
n = int(input(""))

for linhas in range(n): 
    linha = []
    for colunas in range(n): 
        if linhas == colunas:
            linha.append(1)
        else: 
            linha.append(0)
    matriz.append(linha)
            
for linhas in range(n): 
    if linhas > 0 and linhas < n: 
        print()
    for colunas in range(n): 
        print(matriz[linhas][colunas], end = " ")
