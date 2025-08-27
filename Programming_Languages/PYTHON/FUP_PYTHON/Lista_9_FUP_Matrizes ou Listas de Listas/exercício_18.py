import random 
semente = random.seed(int(input("")))

matriz = []
for lin in range(5): 
    line = []
    for col in range(5): 
        line.append(random.randint(1,20))
    matriz.append(line)
   
new_matriz = []
for lin in range(5): 
    line = []
    for col in range(5): 
        if col > lin: 
           line.append(0)
        else: 
            line.append(matriz[lin][col])
    new_matriz.append(line)
    
for lin in range(5): 
    for col in range(5): 
        print(matriz[lin][col], end = " ")
    print()
    
print()

for lin in range(5): 
    for col in range(5): 
        print(new_matriz[lin][col], end = " ")
    print()

