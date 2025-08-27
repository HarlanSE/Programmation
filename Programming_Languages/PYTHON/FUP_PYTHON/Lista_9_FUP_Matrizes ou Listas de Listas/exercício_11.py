matriz = []

for linhas in range(4): 
    linha = []
    for colunas in range(4): 
        linha.append(int(input("")))
    matriz.append(linha)
    
cont = 3
som = 0 
for lin in range(4): 
    for col in range(4): 
        if col == cont: 
            cont -= 1 
            som += matriz[lin][col]
    
print(som)