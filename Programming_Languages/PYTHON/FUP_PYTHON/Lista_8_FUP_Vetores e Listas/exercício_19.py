def funcao(vet1, vet2): 
    new_vet = [0] * 10 
    
    for i in range(len(vet1)):
        new_vet[i * 2] = vet1[i]   
        new_vet[i * 2 + 1] = vet2[i]
    
    return new_vet

# vet1 = []
# for i in range(5): 
#     vet1.append(int(input("")))
    
# vet2 = []
# for i in range(5): 
#     vet2.append(int(input("")))

# print(funcao(vet1, vet2))