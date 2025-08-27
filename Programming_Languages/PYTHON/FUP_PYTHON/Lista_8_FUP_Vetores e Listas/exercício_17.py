def funcao(vet, n): 
    mult = []
    for i in range(len(vet)): 
        if vet[i]%n == 0: 
            mult.append(vet[i])
    return mult

# vet = []
# for i in range(10): 
#     vet.append(int(input("")))
    
# n = int(input(""))

# print(funcao(vet, n))