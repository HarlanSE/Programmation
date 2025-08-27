def funcao(vet):
    new_vet = []
    for i in range(len(vet)): 
        cont = 0
        for c in range(len(vet)):
            if vet[i] == vet[c]: 
                cont += 1 
        if cont == 1: 
            new_vet.append(vet[i]) 
    return new_vet 

# vet = []

# for i in range(10): 
#     vet.append(int(input()))

# print(funcao(vet))