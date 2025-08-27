matriz = []

for lin in range(12): 
    line = []
    for col in range(13):
        line.append(int(input("")))
    matriz.append(line)
    
for lin in range(12): 
    for col in range(13): 
        print(f"{matriz[lin][col]:.2f}", end = " ")
    print()

print()

new_matriz = []
for lin in range(12): 
    maior = 0
    line = []
    for col in range(13):
        if matriz[lin][col] < 0:
            if matriz[lin][col] * -1 > maior:
                maior = matriz[lin][col] * -1 
        if matriz[lin][col] > maior: 
            maior = matriz[lin][col] 
    for col in range(13):  
        line.append(matriz[lin][col] / maior)  
    new_matriz.append(line)

for lin in range(12): 
    for col in range(13): 
        print(f"{new_matriz[lin][col]:.2f}", end= " ") 
    print()