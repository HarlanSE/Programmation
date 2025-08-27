matriz = []

for lin in range(4): 
    linha = []
    for col in range(4): 
        linha.append(int(input("")))
    matriz.append(linha)
    
for lin in range(4): 
    for col in range(4): 
        print(matriz[col][lin], end = " ")
    print()