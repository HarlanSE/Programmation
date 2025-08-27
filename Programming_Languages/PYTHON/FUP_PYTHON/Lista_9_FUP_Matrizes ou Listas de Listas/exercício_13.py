matriz = []

for lin in range(5): 
    linha = []
    for col in range(5): 
        linha.append(int(input("")))
    matriz.append(linha)
    
new_vet = []
for lin in range(5): 
    soma = 0
    for col in range(5): 
        soma += matriz[col][lin]
    new_vet.append(soma)
    
print(new_vet)
        