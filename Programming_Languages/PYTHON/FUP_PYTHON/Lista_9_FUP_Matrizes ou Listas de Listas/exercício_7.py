matriz = []

for lin in range(10): 
    linha = []
    for col in range(10):
        if lin < col: 
            linha.append(2 * lin + 7 * col - 2)
        elif lin > col:
            linha.append(4 * lin**3 - 5 * col**2 + 1)     
        else: 
            linha.append(3 * lin**2 - 1)
    matriz.append(linha)
            
for lin in range(10):
    for col in range(10): 
        print(matriz[lin][col], end = " ")
    print()