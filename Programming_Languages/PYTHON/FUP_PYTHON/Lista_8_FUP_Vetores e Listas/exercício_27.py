def funcao(vet): 
    new_vet = []
    for i in range(len(vet)): 
        if vet[i] != 0: 
            new_vet.append(vet[i])
    return new_vet 

# vet = []
# for i in range(10):
#     vet.append(int(input("")))
# print(funcao(vet))