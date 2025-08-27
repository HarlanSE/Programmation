vetor = []
quadrado = []
    
for i in range(10):
    vetor.append(float(input("")))
    
for i in range(10):
    print(f"{vetor[i]:.2f}")

for i in range(10): 
    quadrado.append(vetor[i] ** 2) 
    print(f"{quadrado[i]:.2f}")