def funcao(vet1,vet2): 
    vet_uni = []
    for i in range(len(vet1)): 
            if vet1[i] not in vet_uni:
                vet_uni.append(vet1[i])
    for i in range(len(vet1)): 
            if vet2[i] not in vet_uni:
                vet_uni.append(vet2[i])
    return vet_uni

# vet1 = []
# for i in range(5): 
#     vet1.append(int(input("")))
# vet2 = []
# for i in range(5): 
#     vet2.append(int(input("")))
    
# print(funcao(vet1, vet2))
