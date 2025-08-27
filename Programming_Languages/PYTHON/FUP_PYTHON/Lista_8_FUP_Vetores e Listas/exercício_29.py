def funcao(vet):
     
    for i in range(len(vet) - 1):
        pos_max = i  
        for j in range(i + 1, len(vet)):
            if vet[j] > vet[pos_max]:  
                pos_max = j
        
    
        vet[i], vet[pos_max] = vet[pos_max], vet[i]
    
    return vet
    
    return 
    
# vet = []
# for i in range(10):
#     vet.append(int(input("")))
# print(vet)

