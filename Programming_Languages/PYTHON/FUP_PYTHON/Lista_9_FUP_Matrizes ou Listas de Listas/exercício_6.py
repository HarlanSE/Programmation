matrizA = []
for lin in range(4): 
    line = []
    for col in range(4): 
        line.append(int(input("")))
    matrizA.append(line)

matrizB = []
for lin in range(4): 
    line = []
    for col in range(4): 
        line.append(int(input("")))
    matrizB.append(line)

new_matriz = []
for lin in range(4): 
    line = []
    for col in range(4):
        if matrizA[lin][col] > matrizB[lin][col]: 
            line.append(matrizA[lin][col])
        else: 
            line.append(matrizB[lin][col])
    new_matriz.append(line)

for lin in range(4): 
    for col in range(4): 
        print(new_matriz[lin][col], end = " ")
    print()
 