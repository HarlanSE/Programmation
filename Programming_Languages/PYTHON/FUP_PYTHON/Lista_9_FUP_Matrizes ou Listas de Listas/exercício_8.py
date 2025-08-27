matriz = []

for linhas in range(4): 
    linha = []
    for colunas in range(4): 
        linha.append(int(input("")))
    matriz.append(linha)
    
som = 0 
for lin in range(4): 
    for col in range(4): 
        if lin < col: 
            som += matriz[lin][col]
    
print(som)